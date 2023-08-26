def solution(n, s, a, b, fares):
    answer = 0
    road = [[20000001 for _ in range(n)] for _ in range(n)]
    for start in range(n):
        road[start][start] = 0
    for start, end, dis in fares:
        road[start-1][end-1] = dis
        road[end-1][start-1] = dis
        
    for i in range(n):
        for j in range(n):
            for k in range(n):
                if road[j][k] > road[j][i] + road[i][k]:
                    road[j][k] = road[j][i] + road[i][k]

    minv = 40000002
    for i in range(n):
        minv = min(minv, road[s-1][i]+road[i][a-1]+road[i][b-1])
    return minv
    return answer
