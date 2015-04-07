def reverse_dict(dictionary):

    result = {}

    for key in dictionary:
        value = dictionary[key]
        result[value] = key

    return result

a = {"key": 0,
    "second_key": 1}

print(reverse_dict(a))
