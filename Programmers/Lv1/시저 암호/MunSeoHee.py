def solution(s, n):
    answer = ""
    for char in s :
        if char == ' ' :
            answer += char
            continue
        move_asc = ord(char) + n
        if (char.isupper() and move_asc > 90) or (char.islower() and move_asc > 122) :
            answer += chr(move_asc - 26)
        else :
            answer += chr(move_asc)
    return answer