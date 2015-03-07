def fib_number(n):

    list = []    
    counter = 0

    if n == 1:
        list = [1]

    elif n == 2:
        list = [1, 1]
    
    else:

        list = [1, 1]
        
        while counter <= n - 2:
            list += [list[len(list)-1]+list[len(list)-2]]
            counter += 1

    return list

print(fib_number(10))
print(fib_number(1))
print(fib_number(2))

def number_list(n):

    counter = 0
    result = ""
    
    for number in n:
        result += str(number)

    return result

def number_fib_list(n):
    return number_list(fib_number(n))

print(number_fib_list(10))

#Reshenie bez konkatenirane na stringove

def number_list_int(n):

    result = 0
    step = 10
    counter = 1
    
    for number in n:
        if number < step:
            result = result * step + number
        else:
            counter += 1
            step = 10 ** counter
            result = result * step + number

    return result

a = number_list_int(fib_number(30))
print(a)
