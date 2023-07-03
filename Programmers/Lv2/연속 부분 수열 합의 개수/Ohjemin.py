def solution(elements):
    answer = 0
    length = len(elements)
    arr = set()
    for i in range(1,length+1):
        for j in range(length):
            if j+i > length : 
                arr.add(sum(elements[j:j+i]) + sum(elements[:j+i-length]))
            else: 
                arr.add(sum(elements[j:j+i]))
    return len(arr)
