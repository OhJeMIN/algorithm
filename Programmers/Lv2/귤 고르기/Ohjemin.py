from collections import deque
def solution(k, tangerine):
    answer = 0
    basket = {}
    for size in tangerine:
        if size in basket:
            basket[size] +=1
        else:
            basket[size] = 1
    for i in sorted(basket.items(), key = lambda x: x[1], reverse = True):
        if k <= 0:
            return answer
        k -= i[1]
        answer +=1
    return answer
