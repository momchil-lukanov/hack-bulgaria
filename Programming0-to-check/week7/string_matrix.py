def str_take(n, string):

    string2 = ""

    for index in range(0, min(n, len(string))):
        string2 += string[index]

    return string2

def string_matrix(matrix_width, strings):

    result = ""
    var = ""

    for i in range(0, matrix_width):
        for j in range(0, matrix_width):
            if len(strings[i]) > matrix_width:
                strings[i] = str_take(matrix_width, strings[i])
            if len(strings[i]) < matrix_width:
                while len(strings[i]) != matrix_width:
                    strings[i] += "X"
            if len(strings[i]) == matrix_width:
                for ch in strings[i][j]:
                    if j < (matrix_width - 1):
                        result += "| " + strings[i][j] + " "
                    else:
                        result += "| " + strings[i][j] + " |" + "\n"

    return result

print(string_matrix(6,["python","gogo","perl","java","haskell","ruby0nRails"]))