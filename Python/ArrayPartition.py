
def arrayPairSum(nums):
    nums.sort(),
    sum = 0
    for i in nums[::2]:
        sum += i
    return sum


ans = arrayPairSum([1, 4, 3, 2])
print(ans)
