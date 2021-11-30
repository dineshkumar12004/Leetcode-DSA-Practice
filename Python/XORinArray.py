
def xorOperation(n, start):
    res = 0
    for i in range(n):
        res ^= start + 2 * i
    return res


ans = xorOperation(5, 0)
print(ans)
