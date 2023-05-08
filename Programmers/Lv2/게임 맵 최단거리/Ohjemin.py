from collections import deque
def solution(maps):
    answer = 0
    n = len(maps)
    m = len(maps[0])
    dx = [1, 0, -1, 0]
    dy = [0, 1, 0, -1]
    visited = [[0 for j in range(m)] for i in range(n)]
    queue = deque()
    visited[0][0] = 1
    queue.append([0,0])
    while queue:
        now_y, now_x = queue.popleft()
        for i in range(4):
            x = now_x + dx[i]
            y = now_y + dy[i]
            if 0<=x<m and 0<=y<n and maps[y][x] == 1:           
                if visited[y][x] ==0:
                    visited[y][x] = 1
                    maps[y][x] = maps[now_y][now_x] + 1
                    queue.append([y,x])
    return -1 if maps[n-1][m-1] == 1 else maps[n-1][m-1]
    
        
