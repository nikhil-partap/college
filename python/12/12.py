# def myfunction (str, str2) :
#     print(f"{str} , {str2}")

# myfunction("ram", "hi")

def square(num):
    num **= 2
    print(num)
# square(4)

# def child (**kids):
#     print("the name of child is "+ kids['fname'])

# child(fname = 'ram', surname = 'sharma')

# def country(country = 'Norway'):
#     print("i am from " + country)
# country("India")
# country()


def lists(arr):
    for i in arr:
        print(i, end=" ")
    print()

no = [5, 6, 7, 8, 3, 4, 9, 1, 2]
lists(no)
# write a function to add two no 
def add(num1,num2):
    return num1 +num2

print(add(4,5))

# Write a function `is_even(n)` that returns `True` if the number is even, otherwise `False`.
def iseven(no):
    if no%2 ==0:
        return True 
    else :
        return False
     

# square and cube of a no
def square_cube (num):
    square = num**2
    cube = num**3 
    print(f"square {square} cube {cube}")
square_cube(4) 

# check is  a no is even or odd
def iseven(no):
    if no%2 ==0:
        return True 
    else :
        return False

# find the factorial of a no 
def factorial(no):
    fact = 1
    for i in range(no):
        fact *=i
    return fact



# cal the sum of the elements in a list
def sum_of_str(st):
    add = 0
    for x in st:
        add+=x
    return add



# check is a no is prime
def isprime(no):
    x = int(no**0.5) +1
    for i in range(2,x): 
        prim = True
        if no%i ==0:
            prim = False        
    if prim:
        return True
    else:
        return False

# take a list and return max and min
def max_min(lis):
    lis.sort()
    return print(f"min is {lis[0]} max is {lis[len(no)-1]}")

# reverse a str 
def strs(lis):
    reverse = []
    x = len(lis)
    for i in range(1,x+1):
        reverse.append(lis[-i])
    return reverse

l = ["hi", "there" , "a" , "v" , 'b' , "c"]

# print(strs(l))

        

# check is a str is paletrome
def pal(str):
    if str == str[::-1]:
        return True
    else :
        return False
    
# if pal("tht"):
#     print("is pal")
# else:
#     print("not pal")



# Write a function `count_vowels(s)` that counts the number of vowels in a string.
def count_vowels(s):
    count =0
    for i in s:
        for j in i:
            if j in ["a","e","i","o","u"]:
                count +=1
    return count


def max_of_three(a, b, c):
    lis = [a, b, c]
    lis.sort()
    return lis[2]

# print(max_of_three(4,3,7))

# 