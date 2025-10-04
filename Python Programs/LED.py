n = int(input("Enter a number: "))
c=n
e=0
o=0
while c!=0:
    d=c%10
    if d%2==0:
        e+=d
    else:
        o+=d
    c//=10
print("LED number" if e==o else "Not a LED number")