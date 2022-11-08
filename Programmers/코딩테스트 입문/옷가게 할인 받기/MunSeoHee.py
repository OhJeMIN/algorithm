import math

def sale(price):
    if (price >= 500000) :
        return price * 0.8
    elif (price >= 300000) :
        return price * 0.9
    elif (price >= 100000) :
        return price * 0.95
    else :
        return price
    
def solution(price):
    return math.trunc(sale(price))
