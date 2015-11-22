a = input("Enter number: ")
b = input("Enter number again: ")
x = input("And again: ")

a = int(a)
b = int(b)
x = int(x)

if x == a:
    print("The number is equal to the lower bound of the interval")
elif x == b:
    print("The number is equal to the upper bound of the interval")
elif a < x and x < b:
    print("The number is in the interval")
elif x < a:
    print("The number is outside the interval, x < a")
elif x > b:
    print ("The number is outside the interval, x > b")
