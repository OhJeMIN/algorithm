import heapq

def solution(S, K):
    answer = 0
    heap = []
    for i in S:
        heapq.heappush(heap, i)

    while heap[0] < K:
        heapq.heappush(heap, heapq.heappop(heap) + heapq.heappop(heap) * 2)
        answer += 1
        
        if len(heap) == 1 and heap[0] < K:
            return -1
    return answer
