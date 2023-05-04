def solution(s): 
    change_s = 0
    removed_s = 0
    while len(s) > 1:
        str = ''
        change_s+=1;
        for i in s:
            if i == '0': 
                removed_s+=1
            else: 
                str+=i      
        s = bin(len(str))[2:]
    return [change_s,removed_s]
