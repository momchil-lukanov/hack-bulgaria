def count_zero_neighbours(numbers):

    result = 0
    
    for x in range(0, len(numbers)):
        for y in range(x, len(numbers)):
            if numbers[x] + numbers[y] == 0:
                result += 1

    return result

a = count_zero_neighbours([0, 2, -2, 5, 10])
print("Общата бройка е: ", a)
