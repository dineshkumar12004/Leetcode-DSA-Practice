def numOfStrings(patterns, word):
    return sum(x in word for x in patterns)


res = numOfStrings(['ab', 'abc'], 'abcd')
print(res)
