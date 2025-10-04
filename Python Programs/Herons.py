a = int(input("Enter first side: "))
b = int(input("Enter second side: "))
c = int(input("Enter third side: "))
if(a+b>c and b+c>a and a+c>b):
    s = (a+b+c)/2
    area = (s*(s-a)*(s-b)*(s-c))**0.5
    print("Area of triangle using Heron's formula is:",area)
else:
    print("Triangle is not possible")