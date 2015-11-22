import math

def is_triangle(a, b, c):

    if a + b > c or a + c > b or b + c > a:
        return True
    else:
        return False

print(is_triangle(3, 4, 5))

def area(a, b, c):

    p = (a + b + c)/2

    s = math.sqrt(p*(p-a)*(p-b)*(p-c))

    return s

print(area(3, 4, 5))

def is_pythagorean(a, b, c):
    
    result = ""

    if a ** 2 + b ** 2 == c ** 2 or a ** 2 + c ** 2 == b ** 2 or c ** 2 + b ** 2 == a ** 2:
        result += "The triangle is pythagorean"
    else:
        result += "It is not pythagorean"

    return result

print(is_pythagorean(3, 4, 5))

def area_list(x):

    a = x[0]
    b = x[1]
    c = x[2]

    p = (a + b + c)/2

    s = math.sqrt(p*(p-a)*(p-b)*(p-c))

    return s

print(area(3, 4, 5))

def max_area(triangles):

    result = 0
    tr_max_area = 0

    for triangle in triangles:
        if area_list(triangle) > tr_max_area:
            tr_max_area = area_list(triangle)
            result = triangle

    return result

print(max_area([[3, 4, 5], [7, 8, 9] ]))
