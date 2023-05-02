def solution(phone_number):
    answer = ''
    phone = list(phone_number);
    for i,v in enumerate(phone_number):
        if(i >= len(phone_number)-4):
            answer += v;
        else: answer += "*"
    return answer
