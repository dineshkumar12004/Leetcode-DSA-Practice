
from typing import DefaultDict


def countBalls(lowLimit, highLimit):
    freq = DefaultDict(int)
    for x in range(lowLimit, highLimit+1):
        freq[sum(int(xx) for xx in str(x))] += 1
    return max(freq.values())


ans = countBalls(1, 100)
print(ans)
