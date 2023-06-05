from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    q = []
    bridge = [0 for i in range(bridge_length)]
    sum_bridge = 0
    while bridge:        
        answer += 1
        sum_bridge -= bridge[0]        
        bridge.pop(0)
        if truck_weights:
            if  sum_bridge + truck_weights[0] <= weight:
                sum_bridge += truck_weights[0] 
                t = truck_weights.pop(0)
                bridge.append(t)
            else:
                bridge.append(0)
    return answer
    
