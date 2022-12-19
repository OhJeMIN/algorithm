def solution(id_pw, db):
    id = id_pw[0]
    pw = id_pw[1]
    
    id_list = [i[0] for i in db]
    if id in id_list :
        if pw == db[id_list.index(id)][1] :
            return "login"
        else :
            return "wrong pw"
    else :
        return "fail"
   
