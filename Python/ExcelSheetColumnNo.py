
def titleToNumber(s):
    ans = 0
    for c in s:
        ans = ans * 26 + ord(c) - ord('A') + 1
    return ans


res = titleToNumber("AA")
print(res)
