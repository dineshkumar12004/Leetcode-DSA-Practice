array = [ 1, 232, 54545, 999991]

n = []
def palindrome(array):
    for i in array:
        if str(i) == str(i)[::-1]:
            n.append(i)
    return max(n)

print(palindrome(array))