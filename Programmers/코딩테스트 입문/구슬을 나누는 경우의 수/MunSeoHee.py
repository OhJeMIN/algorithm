def solution(balls, share):
    den = 1
    mol = 1
    for j in range(1, share + 1):
        den *= j
    for i in range(balls, balls - share, -1) :
        mol *= i
    return mol / den
