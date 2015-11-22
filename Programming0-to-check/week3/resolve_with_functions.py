#Задача 1
def divisors(n):

    count = 1
    divs = []
    divisor = 1

    while count < n:

        if n % divisor == 0:
            divs += [divisor]

        count += 1
        divisor += 1

    return divs

print(divisors(10))

def sum_ints(numbers):

    sum = 0
    
    for number in numbers:
        sum += number

    return sum

print(sum_ints([1, 2, 5]))

#Задача 2
def sum_divisors(x):
    return sum_ints(divisors(x))

print(sum_ints(divisors(10)))

#Задача 3
def is_perfect(x):

    if sum_divisors(x) == x:
        result = "The number is perfect"
    else:
        result = "The number is not perfect"
    
    return result

print(is_perfect(10))

#Задача 4
def first_n_perfect(x):

    start = 6
    list = []
    result = ""

    while True:

        divisors_sum = 0
        divisor = 1

        while divisor < start:
            if start % divisor == 0:
                divisors_sum += divisor

            divisor += 1

        if divisors_sum == start:
            result += str(start) + '\n'
            x = x - 1
    
        if x == 0:
            break

        start += 1

    return result

print(first_n_perfect(3))

# задача 5
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

#Задача 6
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

p = input("Enter number: ")
p = int(p)

q = p - 2
r = p + 2

is_p_prime = is_prime(p)
is_q_prime = is_prime(q)
is_r_prime = is_prime(r)

if is_p_prime and (not is_q_prime) and (not is_r_prime):
    print(str(p) + " is prime")
    print("But " + str(q) + " and " + str(r) + " are not.")
elif is_p_prime:
    if is_q_prime:
        print(q, p)
    if is_r_prime:
        print(p, r)
else:
    print(str(p) + " is not prime.")
