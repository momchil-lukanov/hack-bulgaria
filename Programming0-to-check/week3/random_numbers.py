from random import randint

def generate_random_list(n, start, end):

    counter = 1
    list = []
    
    while counter <= n:
        list += [randint(start, end)]
        counter += 1

    return list

n = int(input())
start = int(input())
end = int(input()) 

print(generate_random_list(n, start, end))
