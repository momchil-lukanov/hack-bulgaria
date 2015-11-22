n = input("Enter number: ")
n = int(n)

total_sum = 0

while n != 0:
    digit = n % 10
   
    total_sum += digit
    
    n = n // 10

print("Sum of digits is: " + str(total_sum))
