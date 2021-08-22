#count of digits in a number



def sumofdigit(n):
    sum = 0
    while n > 0:
        sum += n % 10
        n = n // 10
    return sum

n = int(input("Enter a number: "))  # 3450 12 3

while(n>10):
    n = sumofdigit(n)

print("The number of digits in the number is: ", n)













# def genericroot(n):
#     x = 1+((n-1)%9)
#     return x

# ans = genericroot(int(input("Enter a number: ")))
# print("The root of the number is: ",ans)
