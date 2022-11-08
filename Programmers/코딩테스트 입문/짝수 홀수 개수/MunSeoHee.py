def solution(num_list):
    odd_number = 0
    even_number = 0
    
    for num in num_list : 
        if (num % 2 == 0) :
            even_number += 1
        else :
            odd_number += 1
    return [even_number, odd_number]
