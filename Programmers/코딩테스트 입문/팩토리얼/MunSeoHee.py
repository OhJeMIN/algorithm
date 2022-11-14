def solution(n):
    fac = 1
    for i in range(1, 11) :
        fac = fac * i
        if fac > n :
            return i-1
        elif fac == n :
            return i
