def solution(numbers):
    answer = 45;
    num = 0;
    for i in numbers:
        num += i;
    return answer - num;
