def solution(a, b):
    answer = 0
    for index in range(0, len(a)):
        answer += a[index] * b[index]
    return answer