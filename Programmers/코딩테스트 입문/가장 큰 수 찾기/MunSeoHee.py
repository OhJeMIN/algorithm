def solution(array):
    max_num = 0
    max_index = 0
    for index in range(0, len(array)) :
        if (max_num < array[index]) :
            max_num = array[index]
            max_index = index
    return [max_num, max_index]
