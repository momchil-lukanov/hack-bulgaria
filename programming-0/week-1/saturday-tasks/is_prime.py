n = input("Enter a number: ")
n = int(n)

start = 2
is_prime = True

if n == 1:
    is_prime = False

while start < n:
    if n % start == 0:
        is_prime = False
        break
    start = start + 1

if is_prime:
    print("It is prime")
else:
    print("It is not prime")
