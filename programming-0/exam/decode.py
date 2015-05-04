def string_to_list(string1):

    result = []

    for ch in string1:
        result += [ch]

    return result

def list_to_string(list1):

    result = ""

    for item in list1:
        result += item

    return result

def decode_word(encrypted_word, cipher):

    encrypted_word = string_to_list(encrypted_word)
    result = []

    for item in encrypted_word:
        for key in cipher:
            if item == cipher[key]:
                result += [key]

    return list_to_string(result)

a = decode_word("mjriew", {'h': 'i', 'y': 'j', 'o': 'e', 't': 'r', 'n': 'w', 'p': 'm'})
print(a)
b = decode_word("rpf", {'m': 'p', 'o': 'r', 'g': 'f'})
print(b)
c = decode_word("wfhsftzzuys", {'r': 'f', 'o': 'h', 'i': 'u', 'm': 'z', 'g': 's', 'a': 't', 'p': 'w', 'n': 'y'})
print(c)
d = decode_word("bbbbbbbbbbbbbbbbbbbbbbbbbbb", {'a': 'b'})
print(d)