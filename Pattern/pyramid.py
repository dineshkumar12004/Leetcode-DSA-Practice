num = int(input("Enter no of row:")) #5

for row in range(0,num):
  for space in range(0,num-row-1):
    print(end=" ")
  for star in range(0,row+1):
    print("*",end=" ")
  print()
