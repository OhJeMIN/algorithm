from math import gcd
def solution(arr):
    n = arr[0]
    for i in arr[1:]:
        n = (n * i) // gcd(n,i)
    return n

# 최송공배수 = 두 자연수의 곱 // 두수의 최대공약수
