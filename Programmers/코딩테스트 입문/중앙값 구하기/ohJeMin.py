def solution(array):
    array.sort()
    answer = 0
    halfArrayLenth = 0
    arrayLength = len(array)  
    halfArrayLenth = arrayLength // 2 
    answer =  array[halfArrayLenth]
    return answer