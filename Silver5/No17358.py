import math

mod=math.pow(10,9)+7
n=int(input())
res=1
while(n):
    res=res*(n-1)
    res=res%mod
    n=n-2
print(int(res))
