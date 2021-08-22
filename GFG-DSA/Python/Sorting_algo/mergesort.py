# merge sort

def merge(list1):
    #base case
    if len(list1) > 1:
        mid = len(list1)//2
        left = list1[:mid]
        right = list1[mid:]
        merge(left)
        merge(right)
        i = 0
        j = 0
        k = 0
        while i < len(left) and j < len(right):
            if left[i] < right[j]:
                list1[k] = left[i]
                i += 1
                k+=1
            else:
                list1[k] = right[j]
                j += 1
                k+=1
        while i < len(left):
            list1[k] = left[i]
            i += 1
            k+=1
        while j < len(right):
            list1[k] = right[j]
            j += 1
            k+=1
    return list1

num = int(input("Enter the number of elements: "))
list1 = [int(input()) for x in range(num)]
merge(list1)
print(list1)