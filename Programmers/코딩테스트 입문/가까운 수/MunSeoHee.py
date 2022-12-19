def solution(array, n):
    min = 101
    answer = 0
    array.sort()
    for num in array : 
        absolute = abs(num - n)
        if min > absolute : 
            min = absolute
            answer = num
    return answer
                
