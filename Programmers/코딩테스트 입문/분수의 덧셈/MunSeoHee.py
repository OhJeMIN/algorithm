import math

def solution(denum1, num1, denum2, num2):
    lcm = num1 * num2 // math.gcd(num1, num2)
    denum1 = denum1 * lcm // num1
    denum2 = denum2 * lcm // num2
    gcd = math.gcd(denum1 + denum2, lcm)
    return [(denum1 + denum2) // gcd, lcm // gcd]
