def solution(n):
    answer = ''
    array = list(str(n))
    array.sort(reverse = True)
    for char in array:
        answer += char
    return int(answer)
