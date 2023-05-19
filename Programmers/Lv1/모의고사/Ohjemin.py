def solution(answers):
    answer = [0 ,0 ,0]
    giveUpF = [1,2,3,4,5]
    giveUpS = [2,1,2,3,2,4,2,5]
    giveUpT = [3,3,1,1,2,2,4,4,5,5]
    result = []
    for idx, num in enumerate(answers):
        if answers[idx] == giveUpF[idx%len(giveUpF)]:
            answer[0] +=1
        if answers[idx] == giveUpS[idx%len(giveUpS)]:
            answer[1] +=1
        if answers[idx] == giveUpT[idx%len(giveUpT)]:
            answer[2] +=1
    for idx, s in enumerate(answer):
        if s == max(answer):
            result.append(idx+1)
    return result
