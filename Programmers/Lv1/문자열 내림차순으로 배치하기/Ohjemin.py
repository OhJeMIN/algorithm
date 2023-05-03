def solution(s):
    answer = ''
    result = ''
    answer = sorted(s,reverse=True)
    for i in answer: result+=i;
    return result
