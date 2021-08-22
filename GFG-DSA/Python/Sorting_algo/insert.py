# insertion sort

def insertion(arr):
    for i in range(1,len(arr)):
        current = arr[i]
        pos = i
        while current < arr[pos-1] and pos > 0:
            arr[pos] = arr[pos-1]
            pos -= 1
        arr[pos] = current
    return arr

arr = [3,2,1,4,10]
print(arr)
insertion(arr)
print(arr)
