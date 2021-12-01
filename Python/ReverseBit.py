def reverseBits(n):
    res = 0
    for i in range(32):  # since it is 32 bit integer
        res = res << 1   # left shift to check it till 32 bits
        res += n % 2  # checking if rightmost bit of n is 1 and adding to result
        n = n >> 1     # checking all bits of n till n becomes 0
    return res


n = int(input())
print(reverseBits(n))
