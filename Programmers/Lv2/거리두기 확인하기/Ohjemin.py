def solution(places):
    answer = []
    dx = [1,0,-1,0]
    dy = [0,1,0,-1]
    ddx = [1,1,-1,-1]
    ddy = [1,-1,1,-1]
    for k in range(len(places)):
        flag = True
        for y in range(len(places[0])):
            for x in range(len(places[0][0])):
                if places[k][y][x] == 'P':
                    for i in range(4):
                        X = x + dx[i]
                        Y = y + dy[i]
                        if 0<=X<len(places[k][y]) and 0<= Y < len(places[k]):
                            if places[k][Y][X] == 'P':
                                flag = False
                                break;
                            if places[k][Y][X] == 'O':
                                if places[k][Y+dy[i]][X+dx[i]] == 'P':
                                    flag = False
                                    break;
                    for i in range(4):
                        X = x + ddx[i]
                        Y = y + ddy[i]
                        if 0<=X<len(places[k][y]) and 0<= Y < len(places[k]):                        
                            if places[k][Y][X] == 'P':
                                if places[k][abs(y-Y)][X] == 'O' or places[k][Y][abs(x-X)] == 'O':
                                    flag = False
                                    break;
        answer.append(1) if flag else answer.append(0)                            
    return answer
