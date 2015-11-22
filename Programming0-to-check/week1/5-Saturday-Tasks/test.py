from random import randint

ivan_start = 1001
maria_start = 1001

flag_maria = False
flag_ivan = False

while maria_start != 0 or ivan_start != 0:

    if maria_start > 0:
        maria_start = maria_start - (randint(1, 6) + randint(1, 6) + randint(1, 6) + randint(1, 6) + randint(1, 6))
    elif maria_start < 0:
        maria_start = maria_start + randint(1, 6) + randint(1, 6) + randint(1, 6) + randint(1, 6) + randint(1, 6)
    elif maria_start == 0:
        flag_maria = True
        break

    if ivan_start > 0:
        ivan_start = ivan_start - (randint(1, 6) + randint(1, 6) + randint(1, 6) + randint(1, 6) + randint(1, 6))
    elif ivan_start < 0:
        ivan_start = ivan_start + randint(1, 6) + randint(1, 6) + randint(1, 6) + randint(1, 6) + randint(1, 6)
    elif ivan_start == 0:
        flag_ivan = True
        break

    print("Vremenen rezultat: ", str(maria_start), "za Maria i", str(ivan_start), "za Ivan")

if flag_maria == True:
    print("Pobeditelyat e: Maria")
elif flag_ivan == True:
    print("Pobeditelyat e: Ivan")
