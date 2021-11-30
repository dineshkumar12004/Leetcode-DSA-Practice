
# search for duplicate numbers
def numIdenticalPairs(nums):

    # number of good pairs
    repeat = {}
    num = 0

    # for every element in nums
    for v in nums:

        # number of repeated digits
        if v in repeat:

            # count number of pairs based on duplicate values
            if repeat[v] == 1:
                num += 1
            else:
                num += repeat[v]

            # increment the number of counts
            repeat[v] += 1
        # number has not been seen before
        else:
            repeat[v] = 1
    # return
    return num


nums = [1, 2, 3, 1, 1, 3]
print(numIdenticalPairs(nums))  # 4
