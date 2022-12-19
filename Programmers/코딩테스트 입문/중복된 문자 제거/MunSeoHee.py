def solution(my_string):
    answer = ""
    while (1) :
        if len(my_string) == 0 : 
            break
        char = my_string[0]
        my_string = my_string.replace(char, "")
        answer += char
    return answer
