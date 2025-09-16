# # Write a program to print the Fibonacci series up to N terms using a for loop.

# user_input = int(input("Enter the number of terms: "))
# a = 0 
# b = 1 
# print(a)
# print(b)

# for i in range(2,user_input):
#     next_term = a+b
#     print(next_term)
#     a = b
#     b = next_term



# # Write a program to display the sum of digits of a given number.

# no_str = input("Enter a no to find the sum of its digits : ")

# try:
#     no_int = int(no_str)
    
#     sums = 0

#     for i in range(len(no_str)):
#         sums += int(no_str[i])
    
#     print(sums)    


# except: 
#     print("please enter a valid no ")


# #     11. Print the following triangle pattern:
# # *
# # * *
# # * * *
# # * * * *
# user_input = int(input('enter a no : '))
# for i in range(user_input +1):
#     for j in range(i):
#         print("*" , end="")
#     print()



# #     12. Print the following number pattern:
# # 1
# # 1 2
# # 1 2 3
# # 1 2 3 4

# user_input = int(input('enter a no : '))
# for i in range(user_input +1):
#     for j in range(1,i+1):
#         print(j , end="")
#     print()




# # Print the multiplication tables from 1 to 5.
# for i in range(1,6):
#     print(f"Table of {i}")
#     for j in range (1,11):
#         multiply = i*j
#         print(f"{i} X {j} = {multiply}")



# # Write a program to check whether a given number is prime using a for loop.
# user_input = int(input("Enter a no to check if it is prime "))
# is_prime = True
# if user_input < 2:
#     is_prime = False
# else:
#     for i in range(2, int(user_input ** 0.5) + 1):
#         if user_input % i == 0:
#             is_prime = False
#             break

# if is_prime:
#     print(f"{user_input} is a prime no")
# else:
#     print(f"{user_input} is not a prime no")






# Write a program to find all prime numbers between 1 and 100.

# for i in range(2,100) : 
#    is_prime = True    
#    for j in range(2,int(i**0.5)+1):
#       if i%j == 0:
#         is_prime = False
#         break
#    if is_prime:
#       print(i)         




# # Write a program to check whether a given string is a palindrome using a for loop.
# user_input = input("Enter a str to check if it is palindrome: ")
# if user_input == user_input[::-1]:
#    print("the str is palindrome ")
# else :
#    print("the str is not palindrome ")



# # Write a program to check whether a given string is a palindrome using a for loop.
# user_input = input("Enter a str to check if it is palindrome: ")
# for i in range(len(user_input)):
#     is_pal = True
#     if user_input[i] != user_input[-(i+1)]:
#         is_pal = False
#         break
# if is_pal:
#     print("the entered str is a palindrome")
# else:
#     print("the entered str is not a palindrome")


# Write a program to print factorial of each number from 1 to N.

# user_input = int(input("enter a no to find its factorial: "))
# fact = 1
# for i in range(1,user_input+1):
#     fact *= i
#     print(fact)



#     18. Write a program to generate this pyramid:
#    *
#   ***
#  *****
# *******






