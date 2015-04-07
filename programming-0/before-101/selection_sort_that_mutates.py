def min(n, numbers):

    min_index = n

    for number in range(n, len(numbers)):
        if numbers[number] < numbers[min_index]:
            min_index = number

    return min_index

def swap(i, j, items):

    temp = items[i]
    items[i] = items[j]
    items[j] = temp

    return items

def sorted_swap(list1):

    for i in range(0, len(list1)):
        swap(i, min(i, list1), list1)

    return list1

list1 = [3, 5, 1, 2, 4, -1, 0, -3]
print(sorted_swap(list1))
