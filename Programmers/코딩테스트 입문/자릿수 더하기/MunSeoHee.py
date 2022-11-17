def solution(n):
    answer = 0
    while(1) : 
        value = n % 10
        n = n // 10
        answer += value
        if n == 0 :
            return answer
