# writing if else statements in one line 
# like 
a = 2
b = 4 
print("kjdasfh") if a > b else print("nkldskgjzd") 

"""
write a pg to checkk if a no is even or odd
write a pg to checkk if input is a vovel 
write a pg to checkk if a no is multiple of 5 
write a pg to checkk if a no divisible by seven or not 
write a pg to classify  PERSONs age gp child < 13 tenage 13 - 19 adult 20 - 59 senior 60+
write a pg to asign a grade based on the marks 90+ ==a   75 - 90 b  50- 75 c 0-50 f(fail)
"""




x = int(input("x: "))
if x%2 == 0 :
    print("the no is even")
else :
    print("no is not even")


y = input("enter a alphabet")
if (y.lower() == "a" or y.lower()== "e" or y.lower()=="i" or y.lower()=="o" or y.lower()=="u" ):
    print(f"{y}  is a vovel")
else :
    print(f"{y} is not a vovel")
    
y = int(input("input a no to check if no is multiple by 5: "))
if y%5 == 0:
    print("no is multiple by 5")
else:
    print("no is not multiple by 5")

z = int(input("enter a no to check if it is divisible by 7"))
if y%7 == 0:
    print("no is multiple by 7")
else:
    print("no is not multiple by 7")


a = int(input("Enter your age to find your age gp"))
if a <= 13:
    print("age gp child")
elif a > 13 and a <=19:
    print("age gp Teenage")
elif a > 20 and a <=59:
    print("age gp Adult")
elif a >= 60:
    print("age gp Senior")


a = int(input("Enter your Marks to get your grade"))
if a >= 90:
    print("grade - A")
elif a >= 75 and a <90:
    print("grade - B")
elif a >=50 and a < 75:
    print("grade - C")
elif a < 50:
    print("grade - F")





    