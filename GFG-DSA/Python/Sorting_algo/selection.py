array =[3,2,1,5,4,100,45,21,8,28]

# smallest = array[0]
# smallest_index = 0


for j in range(0,len(array)):
    smallest = array[j]
    smallest_index = j
    for i in range(j+1,len(array)):
        if smallest > array[i]:
            smallest = array[i]
            smallest_index = i
    if array[j] != smallest:
        array[j],array[smallest_index] = array[smallest_index],array[j]
print(array)

