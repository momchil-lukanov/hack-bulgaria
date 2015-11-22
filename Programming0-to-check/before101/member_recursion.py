def member_recursion(x, xs):

    if xs == []:
        return False

    if x == head(xs):
        return True

    return member_recursion(x, tail(xs))

def member_recursion(x, xs):

    if xs == []:
        return False

    return x == head(xs) or x member_recursion(x, tail(xs))