def loss_or_profit(income, outcome):

    result = ""

    a = sum(income) - sum(outcome)

    if a == 0:
        result = "=" + str(a)
    elif a > 0:
        result = "+" + str(a)
    else:
        result = str(a)

    return result

a = loss_or_profit([1, 2, 3], [3])
print(a)
b = loss_or_profit([10], [20, 30])
print(b)
c = loss_or_profit([10], [10])
print(c)