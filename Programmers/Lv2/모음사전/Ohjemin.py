def solution(word):
    answer = 0
    num = [781,156,31,6,1]
    words = {'A':0,'E':1,'I':2,"O":3,"U":4}
    for i in range(len(word)):
        idx = words[word[i]]
        answer += idx * num[i]
    return answer + len(word)
