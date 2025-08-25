# college day 2(19/8/2025) (first lab)
print("hello, world")
"""hi there how are you  """

# variables
a =  5 
b = "hello"

# casting 
 
a =  str(4)  # it will not give any error it will be treated as a strig 
b =  int(5)
c = 'hello single'  # and it is a float you  know that 

print(a , b , c)

print(type(a))
print(type(b))

# rules for  vriable name 
"""
1) a var can have a short name like x or y or more disctiptive name like "carname" , "car"
2) some rule for python    a Var name must start with a letter or the _ character 
3) A VAR name cant start with a  no (5hi)
4) a var can only start with the alpha numaric char and _  
5) var name are case sencitive eg -  age is diff from Age
6) a var name cant be a python keyword 
"""

# camel case 
"""
each word except the first start with a capital letter  
"""
#paskal case
"""
each word starts with a capital letter 
"""

#snake  case 
"""
each word starts with the _
"""

x , y, z  = 4, 5 ,6  

print(x , y, z )

# x, y, z = 4   # wrong 

x=y=z=3

print(x , y, z )


# concatination 

p = "my"
y = "name"
z = "is"
g = "Ram"

print(p+y+z+g)



# same print(x+y+z+g)  , print(x +y +z +g)

print(p,x)

nma = 'ram'

call = 4

age = 8
school = 'dav'

print(call + age)

print(nma, call, age, school)

# print(nma+call)  will give error 



""" 
in bool True, False not true or  false case sencitive 
"""


x, y , z = int(5), str("hi there") ,  complex(5J)

# print()

print(type(call))


print(int(35.6))


print("hi there \"ram\"")
# both the above and below statement are same in logic
print('hi there "ram"')

x = "my_hi_there_guy"

print(x[2])

x = "apple"

for i in range(5):  # the : is imp at the end 
 print(x[i])

# you can also do the above as follow
for i in "apple":
 print(i)


# search 

x = "my_hi_there_guy"

print("name" in x)
print("name" not in x)

print("there" in x)
print("there" not in x)

# class finish tommarow slices 

x = "Hello, World!"

# print(x[0:5])   # Output: Hello  (characters from index 0 to 4)
# print(x[:5])    # Output: Hello  (start defaults to 0)
# print(x[7:])    # Output: World! (end defaults to end of string)
# print(x[::2])   # Output: Hlo ol! (every second character)
print(x[-6:-11]) # Output: World (negative indices count from the end)

