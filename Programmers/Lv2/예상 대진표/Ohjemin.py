def solution(n,a,b):
    answer = 0
    winner = [0 for i in range(n+1)]
    pick = {'A': a, 'B': b}
    while n > 1:
        for i in range(1, n+1, 2):
            winner[(i+1)//2] = winner[i]+1
            if i == a or i+1 == a:
                pick['A'] = (i+1)//2
            if i+1 == b or i == b :
                pick['B'] = (i+1)//2
        n = n // 2
        if pick['A'] == pick['B']:
            return winner[pick['A']]
    return winner[1]
