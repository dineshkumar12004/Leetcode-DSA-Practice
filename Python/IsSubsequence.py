
def isSubsequence(s, t):

    # Empty string is a subsequence of any string.
    if not s:
        return True

    # Nothing can be a subsequence of an empty string, except an empty string.
    if not t:
        return False

    # Let's find the index of first character of s in t.
    first = s[0]
    i = 0
    while i < len(t):
        if t[i] == first:
            break
        i += 1

    # If you can't even find the first character,
    # don't even bother finding the others. Not a subsequence.
    if i >= len(t):
        return False

    else:
        # s is a subsequence of t if:
        # (1) The first character of s is found in t
        # (2) The rest of s is a subsequence of the rest of t
        return isSubsequence(s[1:], t[i+1:])


ans = isSubsequence('abc', 'abracadabra')
print(ans)
