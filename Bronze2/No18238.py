alph='ABCDEFGHIJKLMNOPQRSTUVWXYZ'

arr=str(input())
arr=arr.upper()
sum=0
a=[]
a.append(1)
for i in arr:
    a.append((alph.find(i)+1))
for i in range((len(a)-1)):
    b=a[i+1]-a[i]
    if(b<0): b=0-b
    if(b>(26-b)):
        sum+=(26-b)
    else:
        sum+=b
print(sum)
