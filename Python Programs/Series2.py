n=int(input("Enter number of terms: "))
a=0
b=1
s=0
for i in range(1, n+1):
    print(a, end=", ")
    c=a+b
    a=b
    b=c