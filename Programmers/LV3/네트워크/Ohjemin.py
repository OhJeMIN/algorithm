def solution(n, computers):
    answer = 0
    visited = [False for j in range(n)]    
        
    def DFS(index,computers,n):
        if visited[index]:
            return
        visited[index] = True        
        for i in range(n):
            if i != index and computers[i][index] == 1:
                if not visited[i]:
                    DFS(i,computers,n)
                    
    for i in range(n):
        if not visited[i]:
            DFS(i,computers,n)
            answer +=1
    return answer


#2번째 풀이
def solution(n, computers):
    answer = 0
    visited = [False for i in range(n)]
    
    def DFS(computers, n , i):
        visited[i] = True
        for j in range(n):
            if computers[i][j] == 1 and not visited[j]:
                DFS(computers, n , j)
        
    for i in range(n):
        if not visited[i]:
            DFS(computers, n, i)
            answer +=1
    return answer
