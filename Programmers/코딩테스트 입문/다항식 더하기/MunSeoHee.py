def solution(polynomial):
    polynomial = polynomial.split(" ")
    x_value = 0
    number = 0
    for value in polynomial :
        if 'x' in value :
            x_value += int(value.split('x')[0]) if value.split('x')[0] != '' else 1
        elif value != '+' :
            number += int(value)
    x_string = ''
    string = ''
    if x_value == 1 :
        x_string = 'x'
    elif x_value == 0 :
        x_string = ''
    else :
        x_string = str(x_value) + 'x'
    
    if number == 0 :
        string = ''
    else :
        string = str(number)
        
    if string == '' :
        return x_string
    elif x_string == '' :
        return string
    else :
        return x_string + ' + ' + string
