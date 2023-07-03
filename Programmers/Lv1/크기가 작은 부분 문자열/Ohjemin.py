def solution(t, p):
    answer = 0
    num = len(p)
    for i in range(len(t)-num+1):
        tmp = t[i:i+num]
        if int(p) >= int(tmp) : answer+=1
    return answer
