def countConsistentStrings(allowed, words):
    return sum(set(allowed) >= set(i) for i in words)


ans = countConsistentStrings(["a", "b"], ["a", "b", "b"])
print(ans)
