def solution(order):
    answer = 0
    while (1) :
        value = order % 10
        order = order // 10
        if (value == 3 or value == 6 or value == 9) :
            answer += 1
        if (order == 0) :
            break
    return answer
