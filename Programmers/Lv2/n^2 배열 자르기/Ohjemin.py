def solution(n, left, right):
    answer = [] 
    start_y = 0
    for i in range(1,n+1):
        if i*n <= left < (i+1)*n:
            start_y = i
    idx = start_y*(n) + 1
    for y in range(start_y,n):        
        for x in range(n):
            if idx > right+1:
                break;
            if  left+1<= idx <= right+1:
                if x == y:
                    answer.append(x+1)
                elif x > y:
                    answer.append(x+1)
                else:
                    answer.append(y+1)
            idx +=1
    return answer
