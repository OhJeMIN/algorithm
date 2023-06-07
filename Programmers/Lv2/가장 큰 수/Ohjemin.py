def solution(numbers):
    my_list = [str(num) for num in numbers]
    my_list.sort(key=lambda x: x*3, reverse=True)
    return str(int(''.join(my_list)))
