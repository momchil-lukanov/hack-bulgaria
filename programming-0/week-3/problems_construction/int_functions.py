def reverse_int(n):

    m = 0

    while n % 10 != 0:
        m = m * 10 + n % 10
        n = n // 10

    return m

n = input("Enter a number: ")
n = int(n)
print(reverse_int(n))

def sum_digits(n):

    result = 0

    while n % 10 != 0:
        result += n % 10
        n = n // 10

    return result

n = input("Enter a number: ")
n = int(n)
print("The sum of numbers is: ", sum_digits(n))

def product_digits(n):

    product = 1

    while n % 10 != 0:
        product *= n % 10
        n = n // 10

    return product

n = input("Enter a number: ")
n = int(n)
print("The product of numbers is: ", product_digits(n))
