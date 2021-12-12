def truncateSentence(s, k):
    l = list(s.split(" "))
    return (" ".join(l[:k]))


res = truncateSentence("This is a sentence", 2)
print(res)
