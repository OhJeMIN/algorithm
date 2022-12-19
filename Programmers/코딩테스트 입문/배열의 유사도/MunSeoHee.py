def solution(s1, s2):
    answer = 0
    for s1_num in s1 :
        for s2_num in s2 :
            if s1_num == s2_num :
                answer += 1
    return answer
