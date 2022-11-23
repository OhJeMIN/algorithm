def solution(n):
    answer = 0
    while (1) :
        answer += 1
        while (1) :
            if answer % 3 == 0 :
                answer += 1
            elif '3' in str(answer) :
                answer += 1
            else : 
                break
        n -= 1
        if n == 0 :
            break
    return answer
