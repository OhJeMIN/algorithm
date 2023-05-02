def solution(s):
    List = list(s)    
    for index, value in enumerate(List):
        if(value.isupper()):
            List[index]= value.lower();
    if(List.count('p') != List.count('y')): return False;
    return True;

def solution(s):
    answer = True
    count_p = s.count('p')+ s.count('P');
    count_s = s.count('y')+ s.count('Y');
    if(count_p != count_s): return False
    return True
