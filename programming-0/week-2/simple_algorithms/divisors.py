n = input()
n = int(n)

count = 1
divisors = []
divisor = 1

while count < n:

    if n % divisor == 0:
        divisors += [divisor]

    count += 1
    divisor += 1

print(divisors)
