def base(width, stars):

    points_count = (width - stars) // 2
    stars _string = "*" * stars
    one_side_points = "." * points_count

    return "." * points_count + "*" * stars + "." * points_count


def clock(n):
    width = n
    while n > 0:
        print(base(width, n))
        n -= 2

    n = 3

while n <= width:
    print(base(width, n))
    n += 2

print(clock(5))