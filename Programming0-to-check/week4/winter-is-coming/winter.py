def winter_is_coming(seasons):

    counter = 0
    
    for season in seasons:
        if season == "winter":
            counter = 0
        elif season != "winter":
            counter += 1

    return counter == 5

a = winter_is_coming(["winter", "summer", "summer", "summer", "spring", "srping", "winter"])
print("Иде ли зимата? ", a)
