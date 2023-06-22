def solution(word):
    words = []
    from itertools import product
    for i in product(['A', 'E', 'I', 'O', 'U', ''], repeat=5):
        words.append(''.join(i))
    words = list(set(words))
    words.sort()
    return words.index(word)
