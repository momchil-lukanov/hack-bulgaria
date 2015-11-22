n = input()
n = int(n)

palindrom = n
m = 0

while n != 0:
    m = m * 10 + (n % 10)
    n = n // 10

if palindrom == m:
    print("The number is palinrom")
else:
    print("The number is not palindrom")
