def solution(s):
    answer = ""
    dict = {"zero" : 0,"one" : 1,"two" : 2,"three" : 3,"four" : 4,"five" : 5,"six" : 6,"seven" : 7,
           "eight" : 8, "nine" : 9}
    strs =""
    for i in s:
        if i.isdigit():
            answer+=i
        else:
            strs +=i
        if strs in dict:
            answer += str(dict[strs])
            strs = ""
    return int(answer)
