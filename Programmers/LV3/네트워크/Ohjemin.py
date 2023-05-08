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
