def solution(s):
    answer = False
    if s.isdigit() and len(s) in [4,6]:  
        answer = True                
    return answer
