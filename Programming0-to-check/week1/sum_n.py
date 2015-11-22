number = input("Enter a number: ")

counter = 1
sum = 0

while counter <= int(number):
    sum = sum + counter
    counter += 1

print(sum)
