def solution(arr):
    answer = []
    arr.remove(min(arr));
    return arr if arr else [-1]
