
def divide(dividend, divisor):
    if dividend == 0:
        return 0
    sign = 1 if ((dividend < 0) ^ (divisor < 0)) else 0
    dividend = abs(dividend)
    divisor = abs(divisor)
    res = 0
    while dividend >= divisor:
        k = 0
        while dividend >= divisor << (k+1):
            k += 1
        dividend -= (divisor << k)
        res += 1 << k
    MAX_INT = (1 << 31)-1
    return -res if sign else (res if res <= MAX_INT else MAX_INT)


result = divide(10, 3)
print(result)
