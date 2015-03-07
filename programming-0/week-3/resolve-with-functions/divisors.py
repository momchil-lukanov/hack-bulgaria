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
