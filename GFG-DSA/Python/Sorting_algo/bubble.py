arr = [3,2,1,5,4,100,45,21,8,28]



for i in range(0,len(arr)):
    for j in range(0,len(arr)-1):
        if(arr[j] >arr[j+1]):
            arr[j],arr[j+1] = arr[j+1],arr[j]
        
print(arr)
