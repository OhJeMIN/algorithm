import itertools
def solution(n, left, right):
    answer = []
    idx = 0
    for y in range(n):
        for x in range(n):
            if left <= idx <=right:
                if x == y:
                    answer.append(x+1)
                elif x > y:
                    answer.append(x+1)
                else:
                    answer.append(y+1)
            idx +=1  
    return answer
