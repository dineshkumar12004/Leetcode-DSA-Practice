def isPowerOfFour(num):
    return num > 0 and num & (num-1) == 0 and len("{0:b}".format(num)) % 2 == 1


res = isPowerOfFour(16)
print(res)
