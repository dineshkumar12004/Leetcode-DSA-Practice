
def removeOuterParentheses(s):
    ans = ""
    stack = []

    for br in s:
        if br == '(':
            if stack:
                ans += br
            stack.append(br)
        else:
            ch = stack.pop()
            if stack:
                ans += br
    return ans


result = removeOuterParentheses("(()())(())")
print(result)
