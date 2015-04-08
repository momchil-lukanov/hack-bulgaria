def setify(a):

    result = []

    for item in a:
        if item not in result:
            result += [item]

    return result

print(setify([0, 1, 1, 5, 5, 6]))

def union(a, b):

    result = setify(setify(a) + setify(b))

    return result

sth = [0, 0, 0, 0, 0]
sth2 = [0, 1, 2]
print(union(sth, sth2))

def intersection(a, b):

    result = []

    for item1 in setify(a):
        if item1 in b:
            result += [item1]

    return result

set1 = [0, 0, 1, 2, 5]
set2 = [5, 5, 6]
print(intersection(set1, set2))

def diff(a, b):

    result = []

    for item in setify(a):
        if item not in setify(b):
            result += [item]

    return result

set3 = [0, 1, 2, 3, 4, 5]
set4 = [0, 0, 1, 1, 2, 2, 3, 3]
print(diff(set3, set4))

def cartesian_product(a, b):

    result = []

    for numb1 in setify(a):
        for numb2 in setify(b):
            result += [(numb1, numb2)]

    return result

set5 = [0, 1, 3, 3]
set6 = [1, 2]

print(cartesian_product(set5, set6))
