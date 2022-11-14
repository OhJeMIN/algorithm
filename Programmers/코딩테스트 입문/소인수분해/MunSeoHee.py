def solution(n):
    answer = []
    for i in range(2, n + 1) :
        while (n % i == 0) :
            n = n / i
            answer.append(i)
    return sorted(list(set(answer)))
