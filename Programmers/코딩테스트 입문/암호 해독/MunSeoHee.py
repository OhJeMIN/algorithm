def solution(cipher, code):
    answer = ''
    for index in range(code - 1, len(cipher), code) :
        answer += cipher[index]
    return answer
