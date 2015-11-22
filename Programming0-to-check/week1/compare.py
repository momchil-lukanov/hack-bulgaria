print ("enter a number: ")
a = input()
print ("enter another number: ")
b = input()

if int(a) > int(b):
    print ("a(" + str(a) + ")" + "is bigger than b(" + str(b) + ")")
elif a == b:
    print ("b(" + str(b) + ")" + "is is equal to a(" + str(a) + ")")
elif int(b) > int(a):
    print ("b(" + str(b) + ")" + "is bigger than a(" + str(a) + ")")
else:
    print ("you didn't enter a number")
