def solution(name, yearning, photos):
    dic = {}
    answer = []
    
    for index in range(0, len(name)) :
        dic[name[index]] = yearning[index]
        
    for photo in photos:
        score = 0
        for name in photo:
            if (name in dic) : 
                score += dic[name]
        answer.append(score)
        
    return answer
