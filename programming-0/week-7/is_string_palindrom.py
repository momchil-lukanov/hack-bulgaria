def str_reverse(string1):

    string2 = ""

    for ch in string1:
        string2 = ch + string2

    return string2

def is_string_palindrom(string):

    string = string.lower()

    new_string = ""
    alphabet = "aeiouybcdfghjklmnpqrstvwxz"
    all_numbers = "0123456789"

    for ch in string:
        if ch in alphabet or ch in all_numbers:
            new_string += ch

    return new_string == str_reverse(new_string)

a = "Az obi4am ma4 i boza"
print(is_string_palindrom(a))

a = "A toyota"
print(is_string_palindrom(a))

a = "bozaaa"
print(is_string_palindrom(a))

a = " kapak! "
print(is_string_palindrom(a))
