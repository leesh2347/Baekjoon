def judge(player1,player2):
    player1judge=[0,0,0,0]
    player2judge = [0, 0, 0, 0]
    player1arr=player1[1:]
    player2arr = player2[1:]
    for i in player1arr:
        player1judge[i-1]+=1
    for i in player2arr:
        player2judge[i-1]+=1
    for i in reversed(range(4)):
        if(player1judge[i]!=player2judge[i]):
            if(player1judge[i]>player2judge[i]):
                return 1
            else:
                return 2
    return 3

jj=["","A","B","D"]
times=int(input())
arr=[]
arr2=[]
for j in range(times):
    nums1=list(map(int,input().split()))
    nums2=list(map(int,input().split()))
    arr.append(nums1)
    arr2.append(nums2)
res=""
for j in range(times):
    res=res+jj[judge(arr[j],arr2[j])]
    if(j!=(times-1)):
        res=res+"\n"
print(res)
