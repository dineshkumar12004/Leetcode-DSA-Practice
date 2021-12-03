def lengthOfLastWord(s):
    a = s.split()
    if(len(a) <= 0):
        return 0
    else:
        return len(a[-1])


ans = lengthOfLastWord("Hello World")
print(ans)
