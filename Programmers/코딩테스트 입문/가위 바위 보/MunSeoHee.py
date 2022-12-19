def solution(rsp):
    answer = ""
    for char in rsp :
        if (char == '2') :
            answer += '0'
        elif (char == '0') :
            answer += '5'
        elif (char == '5') :
            answer += '2'
    return answer
