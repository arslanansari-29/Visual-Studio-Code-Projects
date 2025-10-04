n = int(input("Enter a number: "))
c=n
e=0
o=0
s=0
while c!=0:
    d = c%10
    s+=d
    if d%2 == 0:
        e+=d
    else:
        o+=d
    c//=10
print("Sum of all dogits:",s)
print("Sum of even digits:",e)
print("Sum of odd digits:",o)