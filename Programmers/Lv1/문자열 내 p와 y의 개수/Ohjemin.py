def solution(s):
    List = list(s)    
    for index, value in enumerate(List):
        if(value.isupper()):
            List[index]= value.lower();
    if(List.count('p') != List.count('y')): return False;
    return True;
