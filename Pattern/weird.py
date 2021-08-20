row = int(input("Enter the no of row "))
symbol = int(input("Enter the no of symbol"))

space = symbol*2-2
for i in range(row*2-1):
  if(i%2==0):
    print("/\\"*symbol)
  else:
    print("|" +" "*space+ "|")