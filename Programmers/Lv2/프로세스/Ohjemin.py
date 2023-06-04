from collections import deque
def solution(priorities, location):
    answer = 0    
    q = deque()
    order = {}
    for idx, num in enumerate(priorities):
        q.append([idx ,num])
    index = 0
    for i in range(len(priorities)):
        if priorities[index] < max(priorities):
            num = q.popleft()
            q.append(num)
            index+=1
    index = 0
    for i in q:
        order[i[0]] = i[1]
    reverse_order = sorted(order.items(),key=lambda x:x[1],reverse=True)
    for i in reverse_order:
        answer+=1
        if i[0] == location:
            break;
    return answer
