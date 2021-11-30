"""
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

"""

#solution 1

def reverse(x):
    return_val = int(str(abs(x))[::-1])
    if return_val.bit_length() > 31:
        return 0
    else:
        if(return_val > 0):
            return return_val
        else:
            return -return_val

res = reverse(int(input("Enter a number :")))
print(res)