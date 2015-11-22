def drop(string):

    result = ""

    for number in range(1, len(string)):
        result += string[number]

    return result

def trim_left(word):

    result = word

    for ch in word:
        if ch == "!":
            result = drop(word)

    return result

def str_reverse(sth):

    result = ""

    for ch in sth:
        result = ch + result

    return result

def inner_trim(string1):

    string1 = str_reverse(trim_left(str_reverse(trim_left(string1))))
    result = ""

    for number in range(0, len(string1) - 1):
        if string1[number] != "!":
            result += string1[number]
        elif string1[number] == "!" and string1[number + 1] != "!":
                result += string1[number]

    result += string1[len(string1) - 1]

    return result

d = "!Python!!!Jango!"
print(inner_trim(d))