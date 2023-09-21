def solution(k, dungeons):
    answer = 0
    N = len(dungeons)
    visited = [0] * N
    def dfs(k,c,dungeons):
        nonlocal answer
        if c > answer:
            answer = c
        for i in range(N):
            if visited[i] == 0 and k >=dungeons[i][0]:
                visited[i] = 1
                dfs(k-dungeons[i][1],c+1,dungeons)
                visited[i] = 0
    dfs(k, 0, dungeons)
    return answer
