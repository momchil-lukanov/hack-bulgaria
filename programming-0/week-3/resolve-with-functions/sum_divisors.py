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

def sum_divisors(x):
    return sum_ints(divisors(x))

print(sum_ints(divisors(10)))
