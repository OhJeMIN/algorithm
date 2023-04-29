def solution(price, money, count):
    result = money - (sum(range(1, count+1)) * price)
    return abs(result) if result < 0 else 0