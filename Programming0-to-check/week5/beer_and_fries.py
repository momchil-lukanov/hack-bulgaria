def max_score(beers, fries):

    beers = sorted(beers)
    fries = sorted(fries)
    sum = 0
    index = 0
    
    for index in range(0, len(beers)):
            sum += beers[index] * fries[index]
    return sum
        
a = max_score([1000, 1010, 1020, 1030, 1040], [834, 500, -1, 0, 60])
print(a)
