def board_to_string(board):

    result = ""

    for index_x in range(0, len(board)):
        for index_y in range(0, len(board[0])):
            if index_y < 2:
                result += "|" + " " + board[index_x][index_y] + " "
            elif index_y == 2 and index_x != 2:
                result += "|" + " " + board[index_x][index_y] + " " + "|" + "\n"
            elif index_y == 2 and index_x == 2:
                result += "|" + " " + board[index_x][index_y] + " " + "|"

    return result

board = [ ["X", "O", "#"],
          ["X", "X", "X"],
          ["#", "#", "#"] ]

print(board_to_string(board))
