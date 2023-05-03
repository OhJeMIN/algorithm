def solution(s):
    s = list(map(int,s.split()))
    print(s)
    return str(min(s))+" "+ str(max(s))
