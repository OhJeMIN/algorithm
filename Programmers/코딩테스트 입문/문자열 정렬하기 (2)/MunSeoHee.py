def solution(my_string):
    string_list = list(my_string.lower())
    string_list.sort()
    return "".join(string_list)
