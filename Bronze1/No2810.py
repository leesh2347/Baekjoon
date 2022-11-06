n=int(input())
seat=input()
cup=0
s=0
l=0
for w in seat:
    if(w=='L'):
        l+=1
    elif(w=='S'):
        s+=1
cup=int(s+l/2+1)
if(n>cup):
    print(cup)
else:
    print(n)
