n = input()
n = int(n)

digits = []

while n != 0:
    digit = n % 10
    digits = [digit] + digits
    n = n // 10

print("List of digits", digits)

for digit in digits:
    n = n * 10 + digit

print("Number is", str(n))
