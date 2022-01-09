def permuteUnique(nums):

    def getpermutations(i, nums):

        if i >= len(nums):
            res.append(nums)
            return

        for j in range(i, len(nums)):
            if j > i and nums[i] == nums[j]:  # skip swap if i and j have same values
                continue

            nums[i], nums[j] = nums[j], nums[i]
            getpermutations(i+1, nums.copy())

    res = []
    nums.sort()
    getpermutations(0, nums)

    return res


print(permuteUnique([1, 1, 2]))
