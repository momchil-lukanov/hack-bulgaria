from random import randint

print ("Enter sides: ")
a = input()

dice = randint (1, int(a))
b = dice
print (b)
dice = randint (1, int(a))
c = dice
print (c)
dice = randint (1, int(a))
d = dice
print (d)
sum = b + c + d
print (sum)
