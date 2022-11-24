def solution(score):
    answer = [1] * len(score)
    avg_list = []
    
    for arr in score :
        avg_list.append((arr[0] + arr[1]) / 2)
    
    for index in range(0, len(avg_list)) :
        for avg in avg_list :
            if avg_list[index] < avg :
                answer[index] += 1
    return answer
