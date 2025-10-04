a = int(input("Enter a number from 1-7: "))
match a:
    case 1:
        print("Monday")
    case 2:
        print("Tuesday")
    case 3:
        print("Wednesday")
    case 4:
        print("Thursday")
    case 5:
        print("Friday")
    case 6:
        print("Saturday")
    case 6:
        print("Sunday")
    case _:
        print("Wrong input")