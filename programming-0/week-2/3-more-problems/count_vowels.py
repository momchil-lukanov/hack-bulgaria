string = input()

counter = 0
vowels = "aeiouyAEIOUY"

for char in string:
    if char in vowels:
        counter += 1

print(counter)
