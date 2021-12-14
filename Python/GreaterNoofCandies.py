def kidsWithCandies(candies, extraCandies):
    max_val = max(candies)
    return [candy + extraCandies >= max_val for candy in candies]


res = kidsWithCandies([2, 3, 5, 1, 3], 3)
print(res)
