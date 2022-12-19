def solution(sides):
    sides.sort()
    answer = []
    for i in range(sides[1]-sides[0], sides[1]) :
        answer.append(i)
    for i in range(sides[1], sides[1]+sides[0]-1) :
        answer.append(i)
    return len(set(answer))
