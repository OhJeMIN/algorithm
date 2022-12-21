import math
def solution(n):
    square = math.sqrt(n)
    if (square % 1 == 0) :
        return (square + 1) ** 2
    else :
        return -1
