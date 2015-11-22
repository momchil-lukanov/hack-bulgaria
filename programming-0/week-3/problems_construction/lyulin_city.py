def to_the_highest_number(x):

    result = 1
    max = x[0]

    for block in x:

        if block > max:

            max = block
            result += 1

    return result

n = input("How many blocks: ")
n = int(n)

count = 1
list = []

while count <= n:
    sth = input("How many floors of every block: ")
    sth = int(sth)
    list += [sth]
    count += 1

print("I see only", to_the_highest_number(list), "blocks")
