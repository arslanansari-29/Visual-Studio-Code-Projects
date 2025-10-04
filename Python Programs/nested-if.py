a = int(input("Enter first angle: "))
b = int(input("Enter second angle: "))
c = int(input("Enter third angle: "))
if(a>0 and b>0 and c>0 and a+b+c==180):
    print("Triangle is possible")
    if(a>90 or b>90 or c>90):
        print("It is Obtuse angle triangle")
    elif(a==90 or b==90 or c==90):
        print("It is Right angle triangle")
    else:
        print("Is is Acute angle triangle")
else:
    print("Triangle is not possible")