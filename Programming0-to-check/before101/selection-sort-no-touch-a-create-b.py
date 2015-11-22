def diff(list1, list2):

    result = []

    for element in list1:
        if element not in list2:
            result.append(element)

    return result

print(diff([1, 2, 3, 4], [1, 3]))

def min(numbers):

    used = []
    not_used = []
    min_index = 0
    number = 0
    max_index = 0
    result = []

    while number < len(numbers):
        if numbers[number] < numbers[min_index]:
            min_index = number
            used = [min_index] + used
            numbers = diff(numbers, [number])
        elif numbers[number] >= numbers[max_index]:
            max_index = number
            not_used += [max_index] + not_used
            numbers = diff(numbers, [number])

        number += 1

    sum = not_used + used

    print(sum)

    for element in sum:
        sth = element
        result += [sum[sth]]

    return result

a = [4, 2, -1, 3]
print(min(a))