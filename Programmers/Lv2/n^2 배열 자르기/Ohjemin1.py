import itertools
def solution(n, left, right):
    answer = []
    my_list = [[0 for i in range(n)]for j in range(n)]        
    for y in range(n):
        my_list[y][y] = y+1
        for i in range(y):
            my_list[y][i] = my_list[y][y]
            my_list[i][y] = my_list[y][y]
    idx = 0
    for y in range(n):
        for x in range(n):
            if left <= idx <=right:
                num = x if x > y else y
                answer.append(my_list[y][x])
            idx +=1  
    return answer
