array =[3,2,1,5,4,100,45,21,8,28]
array1 = [5,3,1,4,2]


# insertion sort using for loop
for i in range(1,len(array)):
        for j in range(i,0,-1):
            if array[j] < array[j-1]:
                array[j],array[j-1] = array[j-1],array[j]
            else:
                break
print(array)
