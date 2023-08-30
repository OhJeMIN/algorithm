from queue import PriorityQueue
def solution(operations):
    answer = []
    pq = []
    for order in operations:
        op = order[0]
        num = int(order[2:])
        if op == "D":
            if num == -1 and pq:
                pq.remove(min(pq))
            elif num == 1 and pq:
                pq.remove(max(pq))
        else:
            pq.append(num)
    if pq:
        answer.append(max(pq))
        answer.append(min(pq))
    else:
        answer.append(0)
        answer.append(0)
    return answer
