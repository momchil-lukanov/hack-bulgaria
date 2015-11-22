n = input("Enter count of numbers: ")
n = int(n)

count = 1
numbers = []

while count <= n:
    number = input("Enter number: ")
    number = int(number)

    numbers = numbers + [number]

    count += 1

max = numbers[0]

for number in numbers:
    if number > max:
        max = number

print(max)
