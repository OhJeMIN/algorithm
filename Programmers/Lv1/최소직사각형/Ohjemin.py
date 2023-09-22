def solution(sizes):
    mx = 0
    my = 0
    for dx, dy in sizes:
        if dx < dy:
            dx, dy = dy , dx
        mx = max(dx, mx)
        my = max(dy, my)
    return mx * my
