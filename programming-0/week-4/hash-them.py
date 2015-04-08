def hash_them(keys, values):

    result = {}
    index = 0

    for key in keys:
        if index < len(values):
            result[key] = values[index]
        else:
            result[key] = None
            
        index += 1

    return result

a = ["Ivan", "Maria"]
b = [1]
print(hash_them(a, b))
