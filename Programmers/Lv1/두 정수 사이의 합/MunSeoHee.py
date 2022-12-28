def solution(a, b):
    answer = 0
    oper = 1
    if (a > b) :
        oper = -1
    elif (a == b) :
        return a
    for i in range(a, b + oper, oper) :
        answer += i
    return answer
