def sum_main_diagonal(matr):

    result = []

    for index in range(0, len(matr)):
        result += [matr[index][index]]

    return sum(result)

a = sum_main_diagonal([ [23, 28, 21],
                        [22, 24, 26],
                        [27, 20, 25] ])
print(a)

def sum_sec_diagonal(matr):

    result = []
    i = 0
    j = len(matr) - 1

    for number in range(0, len(matr)):
        result += [matr[i][j]]
        i += 1
        j -= 1

    return sum(result)

a = sum_sec_diagonal([ [23, 28, 21],
                       [22, 24, 26],
                       [27, 20, 25] ])
print(a)

def sum_rows(matr):

    for row in matr:
        if sum(row) != sum(matr[0]):
            return False

    return sum(row)

a = sum_rows([ [23, 28, 21],
               [22, 24, 26],
               [27, 20, 25] ])
print(a)

def sum_cols(matr):

    dict = {}

    for col in range(0, len(matr[0])):
        dict[col] = 0

        for row in range(0, len(matr)):
            dict[col] += matr[row][col]

    index = 0
    
    while index < len(matr) - 1:
        if dict[index] != dict[index+1]:
            return False
        index += 1
        
    return dict[0]

a = sum_cols([ [23, 28, 21],
               [22, 24, 26],
               [27, 20, 25] ])
print(a)

def magic_square(matr):

    if sum_main_diagonal(matr) == sum_sec_diagonal(matr) == sum_rows(matr) == sum_cols(matr):
        return True

    return False


a = magic_square([ [23, 28, 21],
            [22, 24, 26],
            [27, 20, 25] ])
print(a)

square2 = magic_square([ [1, 2, 3],
                  [4, 5, 6],
                  [7, 8, 9] ])
print(square2)
