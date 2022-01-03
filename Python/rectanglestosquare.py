def countGoodRectangles(rectangles):
    cnt = mx = 0

    for l, w in rectangles:
        side = min(l, w)
        if side > mx:
            cnt, mx = 1, side
        elif side == mx:
            cnt += 1
        return cnt


rectangle = [[5, 8], [3, 9], [5, 12], [16, 5]]
result = countGoodRectangles(rectangle)
print(result)
