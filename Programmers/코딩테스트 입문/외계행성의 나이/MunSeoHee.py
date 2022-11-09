def solution(age):
    answer = ""
    while (1):
        number = age % 10
        age = age // 10
        answer = chr(number + 97) + answer
        if (age == 0) : 
            return answer
    
