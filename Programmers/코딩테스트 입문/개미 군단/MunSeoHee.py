def solution(hp):
    general_ant = 5
    soldier_ants = 3
    working_ants = 1
    
    answer = hp // general_ant
    hp = hp % general_ant
    
    answer += hp // soldier_ants
    hp = hp % soldier_ants
    
    answer += hp // working_ants
    return answer
