def solution(s):
    answer = []
    arrS = s[2:-2].split("},{")
    sorted_arrS = sorted(arrS, key = lambda x : len(x))
    for i in sorted_arrS:
        arr = i.split(",")
        for num in arr:
            if int(num) not in answer:
                answer.append(int(num))
    return answer
