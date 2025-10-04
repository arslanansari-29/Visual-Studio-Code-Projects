n = int(input("Enter a number: "))
c=n
a=0
while c!=0:
    d=c%10
    a=10*a+d
    c//=10
print("Palindrome number" if a==n else "Not a palindrome number")