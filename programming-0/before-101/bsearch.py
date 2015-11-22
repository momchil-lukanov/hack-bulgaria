def bsearch(x, xs):

    left = 0
    right = len(xs) - 1

    while left <= right:
        mid = (left + right) // 2
        if xs[mid] == x:
            return True
        elif x < xs[mid]:
            right = mid - 1
        else:
            left = mid + 1

    return False

a = [0, 1, 2, 3, 4]
print(bsearch(3, a))
print(bsearch(-1, a))
