def head(list):

    return list[0]

print(head([1, 2, 3]))
print(head(["Python"]))

def last(list):

    return list[len(list) - 1]

print(last([1, 2, 3]))
print(last(["Python"]))

def tail(list1):

    list2 = []

    for number in range(1, len(list1)):
        list2 += [list1[number]]

    return list2

print(tail([1, 2, 3]))

def equal_lists(list1, list2):

    if len(list1) != len(list2):
        return False
    for number in range(0, len(list1)):
            if list1[number] != list2[number]:
                return False

    return True

print(equal_lists([1, 2], [1, 2]))
print(equal_lists([1, 2], [2, 1]))
print(equal_lists([], []))

def count_item(item, list1):

    count = 0

    for x in list1:
        if x == item:
            count += 1

    return count

print(count_item(5, [1, 2, 3, 4, 5]))
print(count_item("winter", ["winter", "winter"]))
print(count_item(False, [True, True]))

def take(n, list1):

    list2 = []

    for index in range(0, min(n, len(list1))):
        list2 += [list1[index]]

    return list2

print(take(2, [1, 2, 3, 4, 5]))
print(take(3, [3, 4, 5, 6, 7, 8]))
print(take(10, [1]))

def drop(n, list1):

    list2 = []

    for index in range(n, len(list1)):
        list2 += [list1[index]]

    return list2

print(drop(1, [1, 2, 3]))

def reverse(list1):

    list2 = []
    last_index = len(list1) - 1

    for number in range(0, len(list1)):
        list2 += [list1[last_index]]
        last_index -= 1

    return list2

print(reverse(["Speak", "in", "reverse", "you", "must!"]))