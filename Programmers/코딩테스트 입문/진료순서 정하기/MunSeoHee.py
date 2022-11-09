def solution(emergency):
    answer = [1] * len(emergency)
    for index in range(0, len(emergency)) : 
        for compare_number in emergency : 
            if (emergency[index] < compare_number) :
                answer[index] += 1
    return answer
