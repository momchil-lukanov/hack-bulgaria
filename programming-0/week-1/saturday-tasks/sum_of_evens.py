n = input("Enter n: ")
n = int(n)

total_sum = 0

start = 1

while start <= n:
    
    if start % 2 == 0:
        total_sum += start

    start += 1

print("The sum is: " + str(total_sum))
