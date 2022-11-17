def solution(num, k):
    num_string = str(num)
    for index in range(0, len(num_string)) :
        if num_string[index] == str(k) :
            return index + 1
    return -1
