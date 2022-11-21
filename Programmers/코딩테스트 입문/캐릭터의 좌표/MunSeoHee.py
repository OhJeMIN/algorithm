def solution(keyinput, board):
    max_width = (board[0] - 1) // 2
    max_hight = (board[1] - 1) // 2
    dot = [0, 0];
    for action in keyinput : 
        if (action == 'left' and dot[0] > max_width * -1) :
            dot[0] -= 1
        elif (action == 'right' and dot[0] < max_width) :
            dot[0] += 1
        elif (action == 'up' and dot[1] < max_hight) :
            dot[1] += 1
        elif (action == 'down' and dot[1] > max_hight * -1) :
            dot[1] -= 1
    return dot
