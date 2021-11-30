# https://leetcode.com/problems/pascals-triangle/
def generate(numRows):
    pascal, prev = [], []

    for i in range(1,numRows+1):
        row = [1] * i

        if len(row) > 2:
            for j in range(len(prev)-1):
                row[j+1] = prev[j] + prev[j+1] 

        prev = row
        pascal.append(row)

    return pascal

numRows = 5
print(generate(numRows))