def countGoodTriplets(A, a, b, c):

    L = len(A)
    n = 0

    for i in range(L-2):
        x = A[i]
        for j in range(i+1, L-1):
            y = A[j]
            if abs(x-y) <= a:
                for k in range(j+1, L):
                    z = A[k]
                    if abs(y-z) <= b and abs(x-z) <= c:
                        n += 1
    return n


A = [3, 0, 1, 1, 9, 7]
a = 7
b = 2
c = 3
ans = countGoodTriplets(A, a, b, c)
print(ans)
