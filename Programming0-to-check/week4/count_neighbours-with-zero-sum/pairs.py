def count_zero_neighbours_2(numbers):

    index = 0
    result = 0
    
    for number in numbers:
        if index < len(numbers) - 1 and numbers[index] + numbers[index + 1] == 0:
            result += 1
        index += 1

    return result

a = count_zero_neighbours_2([1, 2, -2, 0, 0, 5, -5])
print("Общата бройка е: ", a)
