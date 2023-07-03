def solution(elements):
    answer = 0
    length = len(elements)
    arr = []
    for i in range(1,length+1):
        for j in range(length):
            if j+i > length : 
                num = sum(elements[j:j+i]) + sum(elements[:j+i-length])
            else: 
                num = sum(elements[j:j+i])
            if num not in arr:
                arr.append(num)
    return len(arr)
