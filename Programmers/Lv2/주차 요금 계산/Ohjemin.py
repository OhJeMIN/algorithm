import math
def solution(fees, records):
    answer = []
    rf = {}
    for r in records:
        time, num, in_out = r.split(" ")
        rf[num] = rf.get(num,[]) + [time]
    print(rf)    
    for key, value in rf.items():
        total_time = 0
        if len(value) % 2 ==0:
            for i in range(0,len(value),2):
                total_time += (int(value[i+1].split(":")[0]) - int(value[i].split(":")[0]))* 60 + (int(value[i+1].split(":")[1])- int(value[i].split(":")[1]))
        else:
            value.append("23:59")
            for i in range(0,len(value),2):            
                total_time += (int(value[i+1].split(":")[0]) - int(value[i].split(":")[0]))* 60 + (int(value[i+1].split(":")[1])- int(value[i].split(":")[1]))
        rf[key] = total_time
    print(rf)
    for value in dict(sorted(rf.items())).values():
        if fees[0] >= value:
            answer.append(fees[1])
        else:
            answer.append(fees[1]+ (math.ceil((value-fees[0])/fees[2]))* fees[3])
    return answer
