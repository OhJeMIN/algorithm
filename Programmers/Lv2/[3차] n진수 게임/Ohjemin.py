def solution(n, t, m, p):
    answer = ''
    
    def convert_notation(n, base):
        T = "0123456789ABCDEF"
        q, r = divmod(n, base)

        return convert_notation(q, base) + T[r] if q else T[r]

    candidate = []

    for i in range(t*m):
        conv = convert_notation(i, n)
        for c in conv:
            candidate.append(c)
            
    for i in range(p-1, t*m, m):
        print(candidate[i])
        answer += candidate[i]
        
    return answer
    
