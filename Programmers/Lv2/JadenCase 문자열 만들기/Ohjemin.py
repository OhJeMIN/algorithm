def solution(s):
    answer = ''
    jadenCase = list(map(str,s.split(" ")))
    for i in jadenCase:
        answer += i[0:1].upper()+i[1:].lower()+" ";
    return answer[:-1]
