# # arthalmatics , assignment , comparision , logical , identity , membership and bitwise operaters 


# a = 5 
# b = 3

# print(a+b)  # 
# print(a-b)
# print(a*b)  # multiply
# print(a/b)  # divide
# print(a%b)  # modulo 
# print(a**b) # power eg a to the power b
# print(a//b)

# """write a py program that take two no as a input from the xuser and add them"""

# x = int(input("enter first no for operation x: "))
# y = int(input("enter second no for operation y: "))

# print(f"the sum of {x} and {y} is {x+y}")



# """write a pg to calculate the square and cube of a no  """

# # write a pg to find avg of three no
# # write the pg to cal area and parameter of a rectangle 
# # write a pg to convert a c to fahrehight 
# # write a pg to cal simple interest using the formula  st = p*r*T/100
# # WRITE A pg to find sum of digits of a no  eg = 123 = 1+2+3

# print("pg 1 start ")
# print("program to calculate the square and qube of a no ")

# x = int(input("input the no: "))
# y = int(input("input the power (only 2 or 3 ) no: "))

# if(y == 3 ):
#   print(f"the cube of the no is {x**y}")
# elif(y== 2 ):
#   print(f"your square of the no is {x**y}")
# else:
#   print(f"the power you entered is {y} not 2 or 3 please try again ")
# print("pg 1 end ")
# print()
# print()
# print()


# print("pg 2 start ")
# print("program to calculate the avg of three no ")
# x = int(input("first no"))
# y = int(input("second no"))
# z = int(input("third no"))

# print(f"{(x+y+z)/3}")
# print()
# print("pg 2 end ")
# print()
# print()
# print()


# print("pg 3")
# x = input(" rec para = rp and rec area = ra ")
# y , z = int(input("length of rectangle: ")) , int(input("breadth of rectangle: "))

# if (x == "rp"):
#   print(f"para of rectangle is {2(y+z)}")
# # elif (x = "ra"):
# #   print(f"area is {y*z}")
# else:
#   print("retry with proper input ")
# print()
# print("pg 3 end ")
# print()
# print()
# print()
 

# x =  int(input("temp in c"))
# print(f"temp in f {(x* 9/5) + 32}")


# x = int(input("principle:"))
# y = int(input("what so ever r is "))
# z = int(input("time"))

# print(f"ans {(x*y*z)/ 100}")



# x = int(input("any three digit no: "))
# for digit in str(x):
#   y = 0
#   y += digit
#   print(y)






# # write a ppg to check if two no entered by the use are equal or not 
# # write a pr to check weatther a give no is grater than 10 
# # write a pr to check if a person is eligible to vote 
# # write a pr to check no is +ve -ve or 0 
# # write a pg to compare the two no and print the grater no 


# x = int(input("no one: "))
# y = int(input("no two: "))

# if(x == y):
#   print("nos  are equal")
# else:
#   print("nos are not equal")

# x = int(input("input no: "))
# if(x < 0):
#   print("no is -ve")
# elif(x > 0):
#   print("no is +ve ")
# else:
#   print("no is equal to zero")


# x = int(input("enter a no: "))
# if(x > 10):
#   print("no is grater than 10")
# elif(x <= 10): 
#   print("no is less than or equal to 10")


# x = int(input("enter your age: "))
# if(x >= 18):
#   print("you are elligible to vote")
# else:
#   print("you are not elligible to vote")


# x = int(input("no first for comparision : "))
# y = int(input("no second for comparision : "))
# if (x < y):
#   print(f"x is > than y {x}")
# elif(x > y ):
#   print(f"x is < than y {y}")
# else:
#   print(f"x = y {x} = {y}")





# x = int(input("no first for comparision : "))
# y = int(input("no second for comparision : "))
# z = int(input("no third for comparision : "))

# if (x > y and x > z):
#   print(f"x is > than y,z {x}")
# elif(y > x and y > z):
#   print(f"y is > than z,x {y}")
# elif(z > x and z > y):
#   print(f"z is > than x,y {z}")
# else:
#   print(f"unexpected error maybe the nos are same {x,y,z}")


# # identity operator 



# # ouestions 
# """
# 1. Write a program to check if three numbers are in ascending order.

# 2. Write a program to check if two strings entered by the user are same or different.

# 3. Write a program to check if a number is a perfect square.

# 4. Write a program to check whether a person is eligible for a senior citizen discount (age >= 60).

# 5. Write a program to check if two numbers are multiples of each other.
# """



inputs = list(map(int, input(" input three nos with spaces ").split()))
if(inputs == sorted(inputs)):
    print("Already ascending")
else:
  print("not in accending order")



inputs = list(map(int, input(" input two sentences seprated with a coma  ").split(",")))
if (input[1] == input[2]):
   print("The sentetences are same")
else:
   print("the sentences are different from each other")



import math

x = int(input("input a no to check if it is a perfect square: "))
if x < 0:
   print(f"{x} is not a perfect square of any no") 

root = int(math.sqrt(x))
if root*root == x:
   print(f"{x} is not a perfect square of any no") 



input_ = int(input("Enter your age"))
if input_ >= 60:
   print("you are eligible for senior citizen discount")
else:
   print("you are not eligible for senior citizen discount")



print('Enter two no`s and check if they are multiple of each other ')
x, y = int(input("x :") , input("y :"))
if x%y or y%x == 0:
   print(f"{x} and {y} are multiples of each other ")
else:
   print(f"{x} and {y} are not multiples of each other ")






































