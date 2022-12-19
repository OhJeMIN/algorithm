import math
     
def solution(a, b):
    if mod(b/math.gcd(a, b)) == 1 :
        return 1
    else :
        return 2

def mod(num) :
    while (num // 2 != 0 and num % 2 == 0) :
        num = num // 2
    while (num // 5 != 0 and num % 5 == 0) :
        num = num // 5
    return num
    
