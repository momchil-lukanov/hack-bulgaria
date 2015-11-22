def is_perfect(x):

    if sum_divisors(x) == x:
        result = "The number is perfect"
    else:
        result = "The number is not perfect"
    
    return result

print(is_perfect(10))
