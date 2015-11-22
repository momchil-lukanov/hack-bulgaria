def calculate_coins(sum):

    result = {}
    list = [100, 50, 20, 10, 5, 2, 1]
    sum = round(sum * 100)

    
    for item in list:
        result[item] = sum // item
        sum = sum % item
    return result

n = float(input("Enter a float number: "))
print(calculate_coins(n))
