import math
def solution(n, k):
    answer = 0
    tmp = ''
    while n:
        tmp += str(n % k)
        n = n // k
    tmp = tmp[::-1].split("0")
    for i in tmp:
        if len(i)==0:
            continue
        if int(i) < 2:
            continue
        if is_prime_number(int(i)):
            answer+=1    
    return answer

def is_prime_number(x):
    if x == 2 or x ==3 : return True
    for i in range(2, int(math.sqrt(x) + 1)):
        if int(x) % i == 0:
            return False
    return True
