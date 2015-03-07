score = input("Tell me your score: ")
score = int(score)

if score >= 0 and score <= 50:
    print("Slab 2")
elif score > 50 and score < 61:
    print("Sreden 3")
elif score > 60 and score < 71:
    print("Dobar 4")
elif score > 70 and score < 81:
    print("Mnogo dobar 5")
elif score > 80 and score < 100:
    print("Otlichen 6")
elif score == 100:
    print("Mnogo otlichen 7")
