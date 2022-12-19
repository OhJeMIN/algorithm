def solution(my_str, n):
    answer = []
    for index in range(0, len(my_str), n) :
        answer.append(my_str[index : index + n])
    return answer
