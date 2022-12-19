def solution(my_string):
    number = ''
    answer = 0
    for char in my_string :
        if char.isdigit() :
            number += char
        else :
            answer += 0 if number == '' else int(number)
            number = ''
    if number != '' :
        answer += int(number)
    return answer
