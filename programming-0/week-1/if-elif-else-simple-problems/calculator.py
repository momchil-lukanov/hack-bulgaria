print ("Hey, enter a value: ")
a = input()
a = int(a)
print ("Hey, enter another value: ")
b = input()
b = int(b)
print ("Enter an operator +, -, * or /")
operator = input()

print("The results is: ")

if operator == "+":
       print (a+b)
elif operator == "-":
       print (a-b)
elif operator == "*":
       print (a*b)
elif operator == "/":
       print (a/b)
else:
       print ("Unknown operation")
