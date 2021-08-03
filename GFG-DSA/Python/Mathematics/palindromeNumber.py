# palindrome number or not
n = int(input("Enter a number :"))
def palindrome(n):
    if (str(n) == str(n)[::-1]):
        return True
    else:
        return False
result = palindrome(n)

if(result):
    print(f"{n} is a palindrome number")
else:
    print(f"{n} is a not a palindrome number")


#solution 2 

# n = int(input("Enter a number :"))
# def pal(n):
#     rev = 0
#     temp = n
#     while(temp != 0):
#         lastdigit = temp % 10
#         rev = rev*10 + lastdigit
#         temp = temp//10
#     return rev == n

# result = pal(n)
# if(result):
#     print("Palindrome")
# else:
#     print("Not a Palindrome")