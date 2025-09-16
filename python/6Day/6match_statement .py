
# """
# the match statement is used to perform 
# insted of writing many if and else statement you can use match statement the match statement lets one of many code blocks to be executed 
# syntax 
# match expression :
# case X 
#   code bllock
# case X: 
#     code 

#     if there is a match 
#     the match exoression is evaluated once the value of expression is compared to the value of each case if there is a match the associated block of code is executed 
    
# """


# x = int(input("Enter a no "))
# match x:
#     case 1:
#         print("Monday")
#     case 2:
#         print("Tuesday")
#     case 3:
#         print('Wednesday')
#     case 4:
#         print('Thrusday')
#     case 5:
#         print("Friday")
#     case 6:
#         print("saturday")
#     case 7:
#         print("Sunday")
#     case _:
#         print(f"{x}not in list")
    




# x = int(input("Enrter your account balance "))
# y = int(input("Enter withrawal amount "))
# if x < y :
#     print("insuficent balance")
# elif y%100 != 0:
#     print("invalid ammount")
# else :
#     print(f"the amount left after transaction = {x - y}")




# x = int(input("enter you total units : "))

# if x > 200:
#     print(f"you tatal bill is {x*10}")
# elif x > 100 :
#     print(f"you tatal bill is {x*7}")
# elif x > 0:
#     print(f"you tatal bill is {x*5}")
# else :
#     print(f'enter a valid total units "{x}"')

# x =  int(input("Enter your years of service"))
# y = int(input("enter your current salery"))

# if x > 5:
#     if y > 50000:
#         print(f"bonus - {y + (y*0.15)}")    
#     else :
#         print(f"Bonus - {y+(y*0.1)}")
# else :
#     print("no bonus")
     




# # python has two type of loop for loop and while loop 
# x = int(input("Enter nos to be printed : "))
# for i in range(x):
#     print(i+1)
# print("hi 2 ")
# i = 1 
# while i < x+1:
#     print(i)
#     i +=1 




# x = int(input("Enter the distance btw your home and school"))
# if x < 2:
#   print("No bus")
# else:
#    if x < 10:
#       print("Bus Fee 1000")
#    else:
#       if x < 20:
#          print("Bus fee - 2000")
#       else:
#          print("Not eligible")         



# i = 0 
# while i < 6 :
#     i +=1
#     if  i  == 3 :
#       continue  # skip all the bellow steps and start the next loop 
#     print(i)
# else:
#    print("Bye bye")
  
  


# """
# write a pg to print no from i to10 using while loop   X
# write a pg to print even nos form 1 - 20      X 
# write a pg to print the multiplication table of a given no   X
# write a pg to cal the sum of fist n no      X
# write a pg to print nos in reverses from 10 to 1     X
# write a pg to find factorial of the nos using while loop        x
# write a pg to count the  digits of no      X
# write a pg to reverse a no                   X
# write a pg to find the sum of digits of a no   X  
# write a pg to check if a no is palindrome no   X
# write a pg to check if a no is a prime using while loop
# write a pg to find GCD of two no using while loop
# write a pg to generate faboncci series upto n terms using while
# write a pg to keep asking the user for nos until they enter zero them print the sum of all entered no 
# write a pg to simulate a simple login system keep askig for the pasword until the correct password is entered 
# """


# write a pg to print no from i to10 using while loop   X
# for i in range(10):
#    print(i)




# write a pg to print even nos form 1 - 20      X 
# for i in range(20):
#   i +=1
#   if i%2 == 0:
#     print(i)
   



# write a pg to print the multiplication table of a given no   X
# x = int(input("Enter a no to know its multiplication table: "))        
# for i in range(10):
#    print(x*i)




# write a pg to cal the sum of fist n no      X
# y = 0
# x = int(input("Enter a no to know the sum of 0 to n : "))        
# for i in range(x):
#    y = y+i
  

  
# write a pg to print nos in reverses from 10 to 1     X
# i = 10
# while i > 0 :
#    print(i)
#    i -= 1


# # write a pg to find factorial of the nos using while loop        x
# y = 1
# i = 0
# x = int(input("Enter a no to know the sum of 0 to n : "))        
# while i < x:
#   i += 1 
#   y *=i
# print(f"The factorial of {x} is {y}.")





# # write a pg to count the  digits of no  
# x = input("Enter a no to count its digits : ")        
# y = 0
# for i in range(len(x)):
#   y +=1
# print(y)


# # write a pg to reverse a no 
# try:
#   num_str = input("Enter a no to reverse it: ")
#   num_in = int(num_str)

#   if num_in < 0:
#     rev_str  ="-" +num_str[1:][::-1]
#   else:
#     rev_str = num_str[::-1]
  
#   rev_num = int(rev_str)

#   print(f"Original number: {num_in} Reversed number: {rev_num}")



# except ValueError:
#   print("Invalid input. Please enter a valid integer.")




# # write a pg to find the sum of digits of a no             X
#   num_str = input("Enter a no to find the sum of its digits")
  
# try :
#   sum_ = 0
#   for char in num_str:
#     try:
#       sum_ += int(char) 
#     except ValueError:
#       continue

# except ValueError:
#   print("Invalid input Enter a valid int ")




# write a pg to check if a no is palindrome no 
num_str = input("Enter a no to check if a no is palindrome no")

try:
  num = int(num_str)
  if num < 0:
    ispalindrome = (num_str[1:][::-1] == num_str[1:])
    rev = int("-"+num_str[1:][::-1])
  else :
    ispalindrome = (num_str[::-1] == num_str)
    rev = int(num_str[::-1])

  if ispalindrome:
    print(f"palindrome of {num} is {rev}")
  else:
    print(f"The number {num} is not a palindrome.")

except ValueError:
  print("Invalid input. Please enter a valid integer.")
















