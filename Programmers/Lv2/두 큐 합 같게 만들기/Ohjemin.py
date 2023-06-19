from collections import deque
def solution(queue1, queue2):
    answer = 0
    total = sum(queue1) + sum(queue2)
    def BFS(q1,q2, total):
        nonlocal answer
        answer+=1
        if sum(q1) == total and sum(q2) == total :
            return
        if answer == len(q1) + len(q2):
            answer = 0
            return
        if sum(q1) > total : 
            tmp = q1.popleft()
            q2.append(tmp)
            BFS(q1,q2,total)
        else:
            tmp = q2.popleft()
            q1.append(tmp)
            BFS(q1,q2,total)
        
    BFS(deque(queue1),deque(queue2),total//2)
    return answer-1
