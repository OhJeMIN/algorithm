def solution(s):
    answer = []
    for index in range(0, len(s)) :
        sub_string = s[0:index]
        find_index = sub_string.rfind(s[index])
        if (find_index == -1) : 
            answer.append(find_index)
        else :
            answer.append(index - sub_string.rfind(s[index]))
    return answer
