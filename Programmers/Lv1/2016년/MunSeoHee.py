def solution(a, b):
    import datetime
    day = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']
    return day[datetime.date(2016, a, b).weekday()]
