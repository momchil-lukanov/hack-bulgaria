def which_index_column_to_fill_first(row, list2):

    index = 0

    while index < len(list2[row]):
        if list2[row][index] == 0:
            return index
        index += 1

    return True

def which_index_row_to_fill_first(list1):

    index = 0
    result = 0
    min_sum = sum(list1[0])
    sum_current_row = sum(list1[index])
    n_rows = len(list1)

    while index < n_rows:
        if sum_current_row == min_sum and result < index:
            return result
        elif sum_current_row < min_sum:
            result = index
        index += 1

    return result

def when_to_stop_filling(cinema):

    result = 0

    for row in cinema:
        result += len(row)

    return result

def already_taken_seats(cinema):

    result = 0

    for row in cinema:
        result += sum(row)

    return result

def order_of_seats(cinema):

    result = []

    reserved = already_taken_seats(cinema)
    full = when_to_stop_filling(cinema)
    row_index = which_index_row_to_fill_first(cinema)
    col_index = which_index_column_to_fill_first(row_index, cinema)
    len_row = len(cinema) - 1
    len_col = len(cinema[0]) - 1

    while reserved < full:
        if row_index != len_row and col_index != len_col:
            result += [(row_index + 1), (col_index + 1)]
            cinema[row_index][col_index] += 1
        reserved += 1

    return result

cinema = [ [1, 1, 1],
           [1, 0, 0],
           [1, 0, 0],
           [1, 1, 0] ]
print(order_of_seats(cinema))