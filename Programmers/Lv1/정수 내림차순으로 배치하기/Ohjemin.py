def solution(n):
    answer = []
    answer = list(str(n));
    List = ""
    answer.sort(reverse=True)
    for i in answer:
        List+=i
    return int(List)
