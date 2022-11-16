def solution(numbers):
    number_string_list = {
        "zero" : 0, 
        "one" : 1, 
        "two" : 2, 
        "three" : 3, 
        "four" : 4, 
        "five" : 5, 
        "six" : 6, 
        "seven" : 7, 
        "eight" : 8, 
        "nine" : 9
    }
    for number_string in number_string_list.keys() :
        numbers = numbers.replace(number_string, str(number_string_list[number_string]))
    return int(numbers)
