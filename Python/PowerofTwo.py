def isPowerOfTwo(n):
    return not n & n-1 if n else False


res = isPowerOfTwo(200)
print(res)
