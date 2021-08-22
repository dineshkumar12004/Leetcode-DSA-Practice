
arr = [3,5,2,1,4,10,0,9,8,7,6]

for j in range(len(arr)):
    for i in range(len(arr)-1):
        if(arr[i] < arr[i+1]):
            arr[i], arr[i+1] = arr[i+1], arr[i]

print(arr)
