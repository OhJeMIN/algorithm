import math
def solution(n, m):
    answer = []
    return [math.gcd(n, m), n * m / math.gcd(n, m)]