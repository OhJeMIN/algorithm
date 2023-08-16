def solution(n, wires):
    answer = -1
    visited = [False for i in range(len(wires))]
    network = {}
    for idx, n in wires:
        network[idx] = network.get(idx, []) + [n]
        
    #def flow():
        
    for idx, n in enumerate(wires):
        for key, val in network.items():
            flow(idx, n , key, val)
                
    return answer
