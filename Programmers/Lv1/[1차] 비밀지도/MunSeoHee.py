def solution(n, arr1, arr2):
    answer = []
    for i in range(0, n) :
        bit = bin(arr1[i] | arr2[i])[2:]
        if len(bit) != n :
            bit = (n - len(bit)) * ' ' + bit
        bit = bit.replace('1', '#')
        bit = bit.replace('0', ' ')
        answer.append(bit)
    return answer