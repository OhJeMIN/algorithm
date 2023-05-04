def solution(n):
    answer = 0
    count_n = bin(n).count('1')
    while n >0:
        n+=1
        count_next_n = bin(n).count('1')
        if(count_n == count_next_n):
            answer = n
            break
    return answer
