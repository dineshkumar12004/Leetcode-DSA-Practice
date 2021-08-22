# reverse a number 

number = int(input("Enter a number: "))


res = 0
while number > 0:
    digit = number % 10
    res = res*10 + digit
    number = number // 10


print("Reverse of the number is: ", res)

def reverse(x):
    """
    :type x: int
    :rtype: int
    """
    if x == 0:
        return 0
    else:
        if x > 0:
            return int(str(x)[::-1])
        else:
            return -int(str(abs(x))[::-1])

res = reverse(-123)
print(res)


 # factorial of a  number


def factorial(n):
    if n == 0:
        return 1
    else:
        res = 1
        while(n > 0):
            res = res * n
            n = n - 1
        return res
answer = factorial(int(input("Enter a number: ")))
print(answer)

