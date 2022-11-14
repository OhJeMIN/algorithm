def solution(n):
    answer = 0
    for num in range(3, n+1):
        for mod in range(2, num) :
            if num % mod == 0 :
                answer += 1
                break
    return answer
