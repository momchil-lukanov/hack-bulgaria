def min(numbers):

    min_index = 0
    index = 0

    for number in numbers:
        if numbers[min_index] > number:
            min_index = index
        index += 1

    return min_index

def basic_sort(numbers1):

    result = []
    end = len(numbers1)

    while len(result) != end:
        min_numb = min(numbers1)
        result += [numbers1[min_numb]]
        del numbers1[min_numb]

    return result

print(basic_sort([10, 5, 3 ,-2, 0]))
