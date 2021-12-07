def decode(encoded, first):
    arr = [first]
    for i in range(len(encoded)):
        arr.append(arr[i] ^ encoded[i])
    return arr


encoded = [1, 2, 3]
first = 1
ans = decode(encoded, first)
print(ans)
