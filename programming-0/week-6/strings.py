def str_reverse(string1):

    string2 = ""

    for ch in string1:
        string2 = ch + string2

    return string2

print(str_reverse("Python"))

def join(delimeter, items):

    string_x = ""

    for number in range(0, len(items)):
        string_x += items[number]
        if number != len(items) - 1:
            string_x += delimeter

    return string_x

print(join("!", ["Hello", "there"]))

def startswith(search, string):

    if len(search) == 1:
        if search[0] == string[0]:
            return True

    for number in range(0, len(search)):
        if string[number] != search[number]:
            return False

    return True

print(startswith(" "," Rado"))
print(startswith("Py", "Python"))
print(startswith("py", "Python"))
print(startswith("baba", "asdbaba"))

def endswith(search, string):

    parameter_1 = len(search) - 1
    parameter_2 = len(string) - 1
        
    for number in range(0, len(search)):
        if search[parameter_1] != string[parameter_2]:
            return False
        parameter_1 -= 1
        parameter_2 -= 1

    return True

print(endswith(".py", "hello.py"))
print(endswith("kapak", "babakapak"))

def string_to_char(string):
    
    result = []

    for ch in string:
        result += [ch]

    return result

a = "Python"
print(string_to_char(a))

def char_list_to_string(char_list):

    result = ""

    for ch in char_list:
        result += ch

    return result

a = "Python"
print(char_list_to_string(string_to_char("Python")))

def tail_string(string1):

    string2 = ""

    for number in range(1, len(string1)):
        string2 += string1[number]

    return string2

a = "!Rado"
print(tail_string(a))
print(str_reverse(tail_string(a)))

def trim(string):

    for item in string:
        if item == "!":
            string = tail_string(string)
        else:
            break

    string = str_reverse(string)

    for item in string:
        if item == "!":
            string = tail_string(string)
        else:
            break

    string = str_reverse(string)

    return string

a = "!!!!Rado!!!!Rado!!!!"
print(trim(a))
