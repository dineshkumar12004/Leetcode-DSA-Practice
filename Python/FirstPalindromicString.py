def firstPalindrome(words):
    for i in words:
        if i == i[::-1]:
            return i
    return ''


ans = firstPalindrome(['abc', 'abcba', 'abcd', 'cba', 'abcdcba'])
print(ans)
