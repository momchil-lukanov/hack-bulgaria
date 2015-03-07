def number_to_list(x):
    result = 0
    list = []

    while x % 10 != 0:
        list += [x % 10]
        x = x // 10
    
    return list

print(number_to_list(12311984324))

def max_number_from_list(x):

    result = 0
    max = x[0]

    for number in x:
        if number >= max:
            max = number

    return max

print(max_number_from_list(number_to_list(12311984324)))

def largest_to_smallest_list(list):

    result = []
    how_many = len(list)

    while how_many != 0:
        result += [max_number_from_list(list)]
        list.remove(max_number_from_list(list))
        how_many = how_many - 1

    return result

print(largest_to_smallest_list([4, 2, 3, 4, 8, 9, 1, 1, 3, 2, 1]))

def min_number_from_list(list):

    result = 0
    min = list[0]

    for number in list:
        if number <= min:
            min = number

    return min

print(min_number_from_list(number_to_list(12311984324)))

def smallest_to_largest_list(list):

    result = []
    how_many = len(list)

    while how_many != 0:
        result += [min_number_from_list(list)]
        list.remove(min_number_from_list(list))
        how_many = how_many - 1

    return result

print(smallest_to_largest_list([4, 2, 3, 4, 8, 9, 1, 1, 3, 2, 1]))
