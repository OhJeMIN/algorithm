def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        if int(i**0.5)**2 == i:  # 만약 i가 제곱수라면
            answer -= i  # 홀수개의 약수를 가짐
        else:
            answer += i  # 짝수개의 약수를 가짐
    return answer
