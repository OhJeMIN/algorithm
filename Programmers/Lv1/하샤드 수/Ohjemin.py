def solution(x):
    harshad = list(str(x));
    num = 0;
    for i in harshad:
        num +=int(i);
    if(x % num == 0): return True
    return False


def solution(x):
    num = 0;
    for i in str(x):
        num += int(i);
    return x % num ==0
