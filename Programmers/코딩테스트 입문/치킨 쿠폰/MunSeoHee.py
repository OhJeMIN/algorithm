def solution(chicken):
    cupon = chicken
    answer = 0
    while (1) :
        service = cupon // 10
        cupon = cupon % 10 + service
        answer += service
        if cupon < 10 :
            return answer

