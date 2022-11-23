def solution(dots):
    lean_list = []
    
    for dot1 in dots: 
        for dot2 in dots[dots.index(dot1):]:
            if (dot2[1]-dot1[1]) != 0 and (dot2[0]-dot1[0]) != 0:
                lean_list.append((dot2[1]-dot1[1])/(dot2[0]-dot1[0]))                
    if (len(lean_list) != len(set(lean_list))) :
        return 1
    return 0
