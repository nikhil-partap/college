# slicing ( 20/08/2025 )

a = "hello,world!"

print(a[2:7])

print(a[:5])

print(a[2:])

print(a[-5:-1])

x = "welcome"
print(a[3:5])  # dont forget that the count in py starts from 0 like 012345...

b = "hello"
print(b.upper())  

c = "HELLO"
print(c.lower())

d = " My Name "
print(d)
print(d.strip())


e = "Ram"
print(e.replace("R","S"))   # replace all the R with S 

f = "hello world"
print(f.split(" "))    # the split to divide a string with spaces,comas etc 

a = "hello world"
print(a.capitalize())   # first capital 

g = "STring"

print(g.casefold())    # all to lower case
# case fold methord is similar to lower methord but  is stronger and agressive that it will convert more character to lower in comp but are same 

print(g.center(10, "r"))

g = "heLlo world "

print(g.title()) # capatilise the first word of each word 

print(g.swapcase()) # convert the lower to upper and upper to lower 


# print(g.split())

a = "Hello, My name is Ram"

print(a.startswith("Hello"))   # search for hello in the start of the string not else were
"""
Check	                        What it does	                            Returns
string.startswith(substring)	Checks if string starts with substring	    True or False
"print("name" in x) 	        Checks if substring is anywhere in string	True or False
"print("name" not in x) 	    Checks if substring is not in string	    True or False
"""

a = "45678"

print(a.isdigit()) # see if they are digits  ans true 

a, b = "hi", "665jhiu"

print(a.isdigit() , b.isdigit()) # see if they are digits  ans false 

a = "hi_there_56466"

print(a.isalnum()) # true if all are alphanumaric  ans - false 

a = "hi66"
print(a.isalnum()) # true if all are alphanumaric   ans - true 

a = "123"
print(a.isdigit(), a.isdecimal(), a.isnumeric())  # True True True

a = "IV"
print(a.isdigit(), a.isdecimal(), a.isnumeric()) # False False False

a ="Ⅳ"
print(a.isdigit(), a.isdecimal(), a.isnumeric()) # False False True

a="²3"
print(a.isdigit(), a.isdecimal(), a.isnumeric())  #True False True

a="½"

print(a.isdigit(), a.isdecimal(), a.isnumeric()) # false false true 



















