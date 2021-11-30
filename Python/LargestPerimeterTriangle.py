# Largest Perimeter Triangle
def largestPerimeter(A):
    A.sort()
    for i in range(len(A) - 3, -1, -1):
        if A[i] + A[i+1] > A[i+2]:
            return A[i] + A[i+1] + A[i+2]
    return 0


result = largestPerimeter([3, 6, 2, 3])
print(result)  # 8
