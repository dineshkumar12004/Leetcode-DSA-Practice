def sumZero(n):
    if n % 2 == 1:
        res = [0]
    else:
        res = []
    i = 1
    while len(res) != n:
        res = [-i] + res
        res.append(i)
        i += 1
    return res


print(sumZero(5))
