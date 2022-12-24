def solution(s):
    count_p = s.count('P') + s.count('p')
    count_y = s.count('Y') + s.count('y')
    if count_p == count_y :
        return True
    else :
        return False
        
