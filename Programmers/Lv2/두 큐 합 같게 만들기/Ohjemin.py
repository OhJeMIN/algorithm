from collections import deque
def solution(queue1, queue2):
    answer = 0
    limit = (len(queue1)) * 4
    total = sum(queue1) + sum(queue2)
    q1 = deque(queue1)
    q2 = deque(queue2)
    q1_total = sum(q1)
    q2_total = sum(q2)
    while True:                   
        if q1_total > q2_total : 
            tmp = q1.popleft()
            q2.append(tmp)
            q1_total -=tmp
            q2_total +=tmp
            answer+=1
        elif q2_total > q1_total:
            tmp = q2.popleft()
            q1.append(tmp)
            q1_total +=tmp
            q2_total -=tmp
            answer+=1
        else:
            break;
        if answer == limit :
            answer = -1
            break; 
        
    return answer
