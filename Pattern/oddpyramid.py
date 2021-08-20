

def pyramid(num):
  for row in range(num):
    print(" "*(num-row-1)+"* "*(row+1))



pyramid(int(input("Enter the number of rows")))