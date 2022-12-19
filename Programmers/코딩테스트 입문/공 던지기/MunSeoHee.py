def solution(numbers, k):
    index = ((k - 1) * 2 + 1) % len(numbers)
    return numbers[index - 1]
