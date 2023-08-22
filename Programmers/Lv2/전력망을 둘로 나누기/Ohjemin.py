from collections import deque
def solution(n, wires):
    graph = [[] for _ in range(n+1)]
    for start, end in wires:
        graph[start].append(end)
        graph[end].append(start)
    
    
    def checkConnect(start):
        visited = [0] * (n+1)
        q = deque()
        q.append(start)
        visited[start] = 1
        cnt = 0
        while q:
            end = q.popleft()
            for i in graph[end]:
                if not visited[i]:
                    q.append(i)
                    visited[i] = 1
                    cnt +=1
        return cnt
    
    connectedWire = n
    for start, end in wires:
        graph[start].remove(end)
        graph[end].remove(start)
        connectedWire = min(abs(checkConnect(start) - checkConnect(end)), connectedWire)
        graph[start].append(end)
        graph[end].append(start)
        
    return connectedWire
