def solution(quiz):
    answer = []
    for string in quiz :
        string = string.split("=")
        if eval(string[0]) == int(string[-1]) :
            answer.append('O')
        else :
            answer.append('X')
    return answer
