import math

times=int(input())
for i in range(times):
    s=input()
    sq=0
    sq=int(math.sqrt(len(s)))
    oarr=[]
    narr=[]
    for j in range(sq):
        tarr=[]
        tarr2=[]
        for k in range(sq):
            tarr.append(s[sq*j+k])
            tarr2.append('')
        oarr.append(tarr)
        narr.append(tarr2)
    for j in range(sq):
        for k in range(sq):
            narr[k][sq-j-1] =oarr[j][k]
    res=""
    for j in range(sq-1,-1,-1):
        for k in range(sq-1,-1,-1):
            res+=(narr[j][k])
    print(res)
