from collections import deque
def solution(places):
    answer = []
    def BFS(sits):
        start = []        
        for i in range(5):
            for j in range(5):
                if sits[i][j] == 'P':
                    start.append([i,j])
        for s in start:
            queue = deque([s])
            distance = [[0 for i in range(5)] for j in range(5)]
            visited = [[0 for i in range(5)] for j in range(5)]
            visited[s[0]][s[1]] = 1
            while queue:
                y, x = queue.popleft()
                dx = [1,0,-1,0]
                dy = [0,1,0,-1]
                for i in range(4):
                    X = x + dx[i]
                    Y = y + dy[i]
                    if 0<=X<5 and 0<=Y<5 and visited[Y][X] == 0:
                        if sits[Y][X] == 'O':
                            visited[Y][X] =1
                            distance[Y][X] = distance[y][x] + 1
                            queue.append([Y,X])
                        if sits[Y][X] == 'P' and distance[y][x] <=1:
                            return 0
        return 1
                            
                
    for i in places:
        answer.append(BFS(i))
    return answer
