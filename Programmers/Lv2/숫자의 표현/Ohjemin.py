def solution(n):
    answer = 0
    num = 0
    for i in range(1,n+1):
        num = n
        k = i
        while num > 0:
            num -=k
            k+=1
            if num == 0:
                answer+=1
                break
    return answer
