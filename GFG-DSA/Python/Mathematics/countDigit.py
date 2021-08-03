# count of digits in given integer 

def countOfDigits(n):
    count = 0
    while(n > 0):
        n = n//10
        count += 1
    return count 
result = countOfDigits(int(input("Enter a  number: ")))

print("Count is :",result)