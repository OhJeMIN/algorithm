from collections import deque
def solution(k, tangerine):
    answer = 0
    basket = {}
    for size in dict.fromkeys(tangerine):
        basket[size] = basket.get(size,'') + str(tangerine.count(size))
    for i in sorted(basket.items(), key = lambda x: x[1], reverse = True):
        k -= int(i[1])
        answer +=1
        if k <=0:
            return answer
