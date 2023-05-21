def solution(genres, plays):
    answer = []
    melonRank = dict()
    melonNum = dict()        
    for idx, (gen, play) in enumerate(zip(genres,plays)):           #플레이 횟수와 고유번호 저장
        melonRank[gen] = melonRank.get(gen,[]) + [[play,idx]]
        melonNum[gen] = melonNum.get(gen,[]) + [play]
        
    for num in melonNum:                                            #플레이횟수 의 합 저장 후 정렬
        melonNum[num] = [sum(melonNum[num])]
    for i in melonRank:
        melonRank[i].sort(reverse=True)
    
    for i in melonRank:                                             #최대 두개까지 자름
        melonRank[i] = melonRank[i][:2]
                                                                    #정렬된 순서에 맞춰 고유번호 저장
    for i in sorted(melonNum,reverse=True):
        for j in melonRank[i]:
            answer.append(j[1])
        
    return answer
