n = int(input("Enter a number: "))
c=n
s=0
while c!=0:
    d=c%10
    s+=d
    c//=10
# q = n//s
print("Niven number" if n%s==0 else "Not a niven number")
# print(q)