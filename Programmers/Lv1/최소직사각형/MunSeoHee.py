def solution(sizes):
    max_x = 0
    max_y = 0
    for size in sizes:
        if size[0] < size[1] : 
            x = size[1]
            y = size[0]
        else :
            x = size[0]
            y = size[1]
        if max_x < x :
            max_x = x
        if max_y < y :
            max_y = y
    return max_x * max_y