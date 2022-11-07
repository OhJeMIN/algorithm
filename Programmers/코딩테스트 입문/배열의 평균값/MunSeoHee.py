def solution(numbers):
    count = 0
    sum = 0
    for number in numbers:
        sum += number
        count += 1
    return sum/count
