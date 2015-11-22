def is_prime(x):

    start = 2
    is_prime = True

    if x == 1:
        is_prime = False

    while start < x:
        if x % start == 0:
            is_prime = False
            break
        start = start + 1

    return is_prime

print(is_prime(10))

def to_digits(x):

    list = []
    m = 0
    
    while x != 0:
        list += [x % 10]
        x = x // 10
        
    return list

print(to_digits(99448))

def prime_digit(x):

    result = "No, there is no prime digit"

    for number in to_digits(x):
        if is_prime(number):
            result = "Yes, there is a prime digit"
            break

    return result

print(prime_digit(99448))
print(prime_digit(123))
