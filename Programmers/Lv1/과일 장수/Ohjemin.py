def solution(k, m, score):
    answer = 0
    tmp = []
    for idx, i in enumerate(sorted(score,reverse=True)):
        tmp.append(i)
        if (idx+1) % m == 0:
            answer += min(tmp)*len(tmp)
            tmp.clear()
    return answer
