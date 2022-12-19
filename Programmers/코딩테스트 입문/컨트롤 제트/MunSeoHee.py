def solution(s): 
    stack = []
    answer = 0
    list = s.split(' ')
    for item in list : 
        if item == 'Z' :
            stack.pop()
        else :
            stack.append(int(item))
    for item in stack : 
        answer += item
    return answer
