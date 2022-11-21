def solution(spell, dic):
    flag = False
    for string in dic :
        for char in spell :
            if string.count(char) == 1 :
                flag = True
            else :
                flag = False
                break
        if flag : 
            return 1
    return 2
