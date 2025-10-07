# # a lemda fun is a small can take any no of agr but only have one exp  
# x = lambda a: a+10   # this is a fn in one line 
# print(x(6))  

# y = lambda a,b: a+b

# print(y(2,4))

# z = lambda a,b,c : a+b+c 
# print(z(1,2,3))

# # whywee  use slambda fn 
# # the power lam is btter shown when you use them inside 
# c = lambda f,g : (
#     print(c("hi"))
# )
# # use that fn def to mak e afn that always double the no you send in

# x = lambda a :a*2
# print(x(4))


# # use the same defi that always triple the no you send in 

# # we can use it inside a fn like 
# def fn(n):
#     return lambda a:a*n
# # x =lambda myfn (m)
# # y = myfn(3)

# # print(x())

# # write a lam fn to add two no 
# x,y = map(int, input("enter").split(","))

# add = lambda a,b: a+b
# print(add(x,y))

# # fn to find the spr of a no
# inp = int(input("enter :"))

# spr = lambda a:a**2
# print(spr(inp))



# # to check is a no is even
# even = lambda a: f"{a} is even" if a%2 ==0 else f"{a} not even"
# print(even(4))


# to get the last char of a str 
no = [5, 6, 7, 8, 3, 4, 9, 1, 2]
last_char = lambda str: str[len(str)-1]
print(last_char(no))
# find max of two no 
maxi = lambda a,b : f"{a} is grater than {b}" if a> b else f"{a} is less than {b}"
print(maxi(2,3))


# check is a str is a paledrom 
pal = lambda str : True if str == str[::-1] else  False

# finnd the longest word inthe liast 
longest =  lambda words: max(words , key = lambda w :len(w))
words = input("enter : ").split()
print(longest(words))
# to covert cto f c*9/5 *32



# yer , mon = map(int, input("jds :").split())


# import calendar

# yy = yer
# mm = mon
# print(calendar.month(yy,mm))



