# Това е същата задача като sum_n.py
# Намирането на сумата на числата от 1 до n
# С 1 допълнително условие


n = input("Enter n: ")
n = int(n)

# В променлива ще държим сумата на числата от 1 до n
# На всяко завъртане в цикъла ще прибавяме към нея
total_sum = 0

# В тази променлива ще държим поредното число от 1 до n
start = 1

while start <= n:
    # Събираме само четните числа в total_sum
    if start % 2 == 0:
        total_sum += start

    start += 1

print("The sum is: " + str(total_sum))
