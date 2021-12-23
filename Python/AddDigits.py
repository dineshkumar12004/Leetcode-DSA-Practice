
def addDigits(num):
    if num % 9 == 0 and num != 0:
        return 9
    else:
        return num % 9


res = addDigits(38)
print(res)
