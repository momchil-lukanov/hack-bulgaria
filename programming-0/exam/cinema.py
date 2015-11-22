def get_numbers_of_seats(cinema, something):

    result = 0

    for row in cinema:
        for column in row:
            if column == something:
                result += 1

    return result

def get_row_with_min_seats(cinema):

    rows_with_zeros = []

    for row_index in range(0, len(cinema)):
        zero_count = 0
        for column in cinema[row_index]:
            if column == 0:
                zero_count += 1
        if zero_count != 0:
            rows_with_zeros += [(row_index, zero_count)]

    min_row_index = rows_with_zeros[0][0]

    if len(rows_with_zeros) == 1:
        return min_row_index

    for row_index in range(0, len(rows_with_zeros)):
        if rows_with_zeros[row_index][1] < rows_with_zeros[min_row_index][1]:
            min_row_index = rows_with_zeros[row_index][0]

    return min_row_index

def orders_seats(cinema):

    result = []
    not_taken_seats = get_numbers_of_seats(cinema, 0)

    while not_taken_seats != 0:
        min_row_index = get_row_with_min_seats(cinema)
        for seat_index in range(0, len(cinema[min_row_index])):
            if cinema[min_row_index][seat_index] == 0:
                cinema[min_row_index][seat_index] = 1
                result += [(min_row_index + 1, seat_index + 1)]
                not_taken_seats -= 1

    return result


cinema = [ [1, 1, 1],
           [1, 0, 0],
           [1, 0, 0],
           [1, 1, 0] ]

print(orders_seats(cinema))
