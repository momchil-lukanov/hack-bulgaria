def hash_them(keys, values):

    result = {}
    index = 0
    
    for key in keys:
        if index >= 0 and index < len(values):
            result[key] = values[index]
        else:
            result[key] = None

        index += 1
    
    return result

a = hash_them(["name"], ["ivan", 23])
print(a)
