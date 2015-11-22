import math

def fact(x):

    start = 1
    result = 1

    if x == 1:
        return result

    while start <= x:
        result *= start
        start += 1

    return result

print(fact(10))

def fact_digits(n):

    result = 0

    while n != 0:
        result += math.factorial(n % 10)
        n = n // 10

    return result

print(fact_digits(999))

def is_increasing(seq):

    index = 0

    while index != len(seq) - 1:
        if seq[index] > seq[index + 1]:
            return False
        index += 1

    return True

print(is_increasing([1, 2, 3, 4, 5]))
print(is_increasing([1]))
print(is_increasing([5, 6 , -10]))
print(is_increasing([1, 1, 1, 1]))

def is_decreasing(seq):

    index = 0

    while index != len(seq) - 1:
        if seq[index] < seq[index + 1]:
            return False
        index += 1

    return True

print(is_decreasing([5, 4, 3, 2, 1]))
print(is_decreasing([1, 2, 3, 4, 5]))

def reverse_str(word):

    result = ""

    for ch in word:
        result = ch + result

    return result

print(reverse_str("word"))

def drop_str(n, str1):

    str2 = ""

    for index in range(2, len(str1)):
        str2 += str1[index]

    return str2

print(drop_str(2, "0b01"))

def hack_numbers(n):

    n = drop_str(2, bin(n))
    sum_of_ones = 0

    for sth in n:
        if int(sth) == 1:
            sum_of_ones += 1

    if reverse_str(n) == n and sum_of_ones % 2 == 1:
        return True

    return False

print(hack_numbers(7))
print(hack_numbers(1))
print(hack_numbers(7919))