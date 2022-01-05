def threeEqualParts(nums):
    n = nums.count(1)
    if n == 0:
        return [0, 2]  # any split would satify
    if n % 3 != 0:
        return [-1, -1]
    idx = [i for i, num in enumerate(nums) if num == 1]
    s1, e1, s2, e2, s3, e3 = idx[0], idx[n//3 -
                                         1], idx[n//3], idx[2*n//3-1], idx[2*n//3], idx[n-1]
    tracingZeros = len(nums) - 1 - e3
    if e1 + tracingZeros >= s2 or e2 + tracingZeros >= s3 or not nums[s1: e1] == nums[s2: e2] == nums[s3: e3]:
        return [-1, -1]
    return [e1 + tracingZeros, e2 + tracingZeros + 1]


result = threeEqualParts([1, 1, 0, 1, 1])
print(result)
