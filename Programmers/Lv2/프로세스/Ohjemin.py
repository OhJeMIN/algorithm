from collections import deque
def solution(priorities, location):
    answer = 0
    order = {}    
    q = deque() 
    for idx, num in enumerate(priorities):
        order[idx] = order.get(idx,[]) + [num]
    reverse_order = sorted(order.items(),key=lambda x:x[1],reverse=True)
    for i in reverse_order:
        q.append(i)
    for i in q:
        print(i)
    print(reverse_order[0][0])
    print(q)
    print(order)
    return answer
