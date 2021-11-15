# PlusOne
def plusOne(digits):
    if digits[-1] < 9:
        digits[-1] += 1
        return digits
    elif len(digits) == 1 and digits[0] == 9:
        return [1, 0]
    else:
        digits[-1] = 0
        digits[0:-1] = plusOne(digits[0:-1])
        return digits


print(plusone([1, 2, 3]))  # [1,2,4]
