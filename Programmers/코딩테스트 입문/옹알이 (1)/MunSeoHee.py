def solution(babbling):
    readable_list = ["aya", "ye", "woo", "ma"]
    answer = 0
    for word in babbling :
        string = word
        for readable in readable_list :
            string = string.replace(readable, "/")
        string = string.replace("/", "")
        if string == "" :
            answer += 1
    return answer
