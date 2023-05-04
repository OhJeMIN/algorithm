def solution(n):
    answer = 0
    str_n = bin(n)[2:]
    num = 0
    for i in str_n:
        if i == '1':
            num+=1
    while n > 0:
        n+=1
        str_n = bin(n)[2:]
        num_two = 0
        for i in str_n:
            if i == '1':
                num_two+=1
        if(num == num_two):
                answer = n
                break;
    return answer
