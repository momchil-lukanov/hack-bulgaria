def taken_name(surname_husband, surname_wife):

    if surname_husband in surname_wife:
        return True

    return False

a = taken_name("Petrov", "Petrova")
print(a)
a = taken_name("Ivanov", "Tsvetanova")
print(a)
a = taken_name("Petrov", "Ivanova-Petrova")
print(a)