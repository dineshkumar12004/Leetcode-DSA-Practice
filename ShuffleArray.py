def shuffle(nums, n):

    result = []
    for i in range(n):
        result.append(nums[i])
        result.append(nums[n+i])

    return result


ans = shuffle([2, 5, 1, 3, 4, 7], 3)
print(ans)
