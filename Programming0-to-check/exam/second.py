def reverse(list):

    result = []

    for item in list:
        result = [item] + result

    return result

def second_largest(numbers):

    numbers = reverse(sorted(numbers))
    q = len(numbers)
    new_numbers = []

    if q < 2:
        return False

    elif q == 2:
        if numbers[0] == numbers[1]:
            return False
        elif numbers[0] != numbers[1]:
            return numbers[1]

    elif q > 2:
        for number in numbers:
            if number != numbers[0]:
                new_numbers += [number]

    if new_numbers == []:
        return False

    return new_numbers[0]

c = second_largest([])
print(c)

d = second_largest([2, 1])
print(d)

e = second_largest([5, 5])
print(e)

f = second_largest([100, 100, 90])
print(f)

g = second_largest([100, 100, 100])
print(g)