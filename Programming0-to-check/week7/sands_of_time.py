def sands(n):

    result = ""
    par = n - (4 + (n - 5) // 2)

    for i in range(1, n + 1):
            if i == 1 or i == n:
                result += n * "*" + "\n"
            elif i <= n // 2 + 1:
                result += ((i - 1) * " ") + (n - 2 * (i - 1)) * "*" + ((i - 1) * " ") + "\n"
            else:
                result += (par * " ") + ((n - 2 * par) * "*") + (par * " ") + "\n"
                par -= 1

    return result

print(sands(7))
print(sands(5))
print(sands(9))