n = input()
n = int(n)

count = 1
names = []

while count <= n:
    name = input("Enter word: ")
    names += [name]

    count += 1

names = sorted(names)

for name in names:
    print(name)
