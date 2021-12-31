def removePalindromeSub(s):
    # IF EMPTY STRING RETURN 0
    if not s:
        return 0
        # IF STRING IS SAME AS REVERSE RETURN 1
    if s == s[::-1]:
        return 1
    return 2


result = removePalindromeSub("ababa")
print(result)
