def solution(s):
    result = ""
    for word in s.split(' ') :
        for index in range(0,len(word)) :
            if word[index] == ' ' :
                result += word[index]
            elif index % 2 == 0 : 
                result += word[index].upper()
            else :
                result += word[index].lower()
        result += " "
    return result[:-1]
