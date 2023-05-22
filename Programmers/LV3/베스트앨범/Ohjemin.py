def solution(genres, plays):
    answer = []
    melonRank = dict()
    melonNum = dict()        
    for idx, (gen, play) in enumerate(zip(genres,plays)):               #플레이 횟수와 고유번호 저장
        melonRank[gen] = melonRank.get(gen,[]) + [[play,idx]]
        melonNum[gen] = melonNum.get(gen,[]) + [play]
        
    for num in melonNum:                                                #플레이횟수 의 합 저장 후 정렬
        melonNum[num] = [sum(melonNum[num])]
    for i in melonRank:
        melonRank[i] = sorted(melonRank[i], key = lambda x : (-x[0], x[1]))

    for i in melonRank:                                                 #최대 두개까지 자름
        melonRank[i] = melonRank[i][:2]
    print(melonRank)    
    for i in sorted(melonNum,key=lambda x:melonNum[x], reverse=True):   #정렬된 순서에 맞춰 고유번호 저장    
        for j in melonRank[i]:
            answer.append(j[1])
        
    return answer
