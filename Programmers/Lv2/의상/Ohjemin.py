def solution(clothes):
    answer = 0
    combee = dict()
    for name,types in clothes:
        combee[types] = combee.get(types,[]) + [name]
    combee_multi = 1    
    for i in combee:
        combee_multi *=len(combee[i])+1        
    return combee_multi-1
