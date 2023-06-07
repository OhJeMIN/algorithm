from itertools import combinations, permutations

def solution(numbers):
    answer = []
    combi = list(combinations(numbers, 2))
    for num1, num2 in combi :
        answer.append(num1+num2)
    return sorted(list(set(answer)))
