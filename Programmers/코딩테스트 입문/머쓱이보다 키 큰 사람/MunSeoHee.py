def solution(array, height):
    answer = 0
    array.sort(reverse=True)
    for num in array :
        if num > height :
            answer += 1
    return answer
