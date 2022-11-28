def solution(before, after):
    for char in after :
        if char in before :
            before = before.replace(char, "", 1)
        else :
            return 0
    return 1
