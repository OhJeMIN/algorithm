import math

def solution(n):
    lcm = 6 * n / math.gcd(6, n)
    return lcm // 6
