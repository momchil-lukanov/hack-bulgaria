def is_prime(n):

    start = 2
    is_prime = True

    if n == 1:
        is_prime = False

    while start < n:
        if n % start == 0:
            is_prime = False
            break
        start = start + 1

    return is_prime

def prime_pair(numbers):
    
    for x in numbers:
        for y in numbers:
            if is_prime(numbers[x] + numbers[y]):
                return True

    return False

a = prime_pair([1, 2, 3, 4, 5])
print(a)
