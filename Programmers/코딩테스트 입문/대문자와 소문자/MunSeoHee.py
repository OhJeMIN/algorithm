def solution(my_string):
    answer = ''
    for char in my_string :
        asc = ord(char)
        if (asc >= 97 and 122 >= asc) :
            answer += chr(asc - 32)
        else :
            answer += chr(asc + 32)
    return answer
