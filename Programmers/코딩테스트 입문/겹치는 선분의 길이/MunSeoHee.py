def solution(lines):
    line = [0]*200
    for target in lines :
        for dot in range(target[0], target[1]) :
            line[dot+100] += 1
            
    answer = 0
    for value in line :
        if value >= 2 :
            answer += 1
    return answer
