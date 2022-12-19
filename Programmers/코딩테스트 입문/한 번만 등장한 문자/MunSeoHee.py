def solution(s):
    string = list(s)
    answer = []
    for char in string :
        if string.count(char) == 1 :
            answer.append(char)
    answer.sort() 
    return ''.join(answer)
