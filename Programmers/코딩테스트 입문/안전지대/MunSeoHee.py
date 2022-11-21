dots = [
    [-1, -1],
    [-1, 0],
    [-1, 1],
    [0, -1],
    [0, 1],
    [1, -1],
    [1, 0],
    [1, 1]
]

def solution(board):
    boards = []
    answer = 0
    for row in board :
        boards.append([-1] + row + [-1])
    boards = [[-1] * (len(boards[0]))] + boards + [[-1] * len(boards[0])]
   
    for row in range(1, len(boards) - 1) :
        for col in range(1, len(boards[0]) - 1) :
            if boards[row][col] == 1 :
                for dot in dots :
                    if boards[row+dot[0]][col+dot[1]] == 0:
                         boards[row+dot[0]][col+dot[1]] = 'X'
                boards[row][col] = 'X'
                
    for row in boards :
        for col in row : 
            if col == 0 :
                answer += 1
    return answer
