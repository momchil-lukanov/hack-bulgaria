def reverse(list):

    result = []

    for item in list:
        result = [item] + result

    return result

def second_largest(numbers):

    numbers = reverse(sorted(numbers))
    new_numbers = []

    for number in numbers:
        if number not in new_numbers:
            new_numbers += [number]

    if len(new_numbers) < 2:
        return False

    return new_numbers[1]

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