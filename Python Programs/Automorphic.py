n = int(input("Enter a number: "))
c=n
sq=n*n
k=0
while c!=0:
    k+=1
    c//=10
print("Automorphic number" if sq%(10**k)==n else "Not an automorphic number")