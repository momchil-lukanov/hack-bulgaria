def square(number):
    return int(number) ** 2

def factorial(number):
    number = int(number)
    count = 1
    sum = 1
    
    while count <= number:
        sum = sum * count
        count += 1

    return sum

def count_elements(items):

    count = 0
    
    for item in items:
        count += 1

    return count
    
def member(x, xs):

    found = False

    for neshto in xs:
        if neshto == x:
            found = True
            break

    return found


def grades_that_pass(students, grades, limit):

    index = 0
    list_of_names_that_pass = []

    for student in students:
        if grades[index] >= limit:
            list_of_names_that_pass += [students[index]]

        index += 1

    return list_of_names_that_pass
