a = input("Enter a number a: ")
b = input("And again - b:")
a = int(a)
b = int(b)

while a <= b:
    
    if a % 2 == 0:
        print(str(a), "is even")
    elif a % 2 != 0:
        print(str(a), "is odd")

    a = a + 1
