def targetIndices(nums, target):
    # count occurence of the target
    # count how many numbers are less than target
    count = 0
    isless = 0
    for i in range(len(nums)):
        if nums[i] == target:
            count += 1
        if nums[i] < target:
            isless += 1
    if count == 0:
        return []
    res = [isless]
    while count > 1:
        isless += 1
        res.append(isless)
        count -= 1
    return res


nums = [1, 2, 5, 2, 3]
target = 3
ans = targetIndices(nums, target)
print(ans)
