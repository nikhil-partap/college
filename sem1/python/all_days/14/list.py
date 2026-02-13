#  it offers ashorter sintex when you want to create a new list bsed on the values of existing list

# eg - based on the list of fruits you want the list contaning only the fruits with the letter "A" in the name 

# fruits = ["apple", "banana", "cherry", "grape"]
# # newList = []

# # for x in 


# # newList = [x  for x in fruit if "a" in x]
# # print(newList)

# # create a list of squares of nos form 
# squares = [x**2 for x in range(1,6)]
# print(squares)
# # create a list of even nos
# even = [no for no in range(10) if no%2 == 0]
# print(even)
# #  list of first letters from a list of words z
# first_word = [firstChar[0] for firstChar in fruits ]
# print("first word")
# print(first_word)
# # convert a list of str into alist of their len
# lenght = [len(fruit) for fruit in fruits]
# print(lenght)

# # generate a list of no from 1 to fifty that are divisible by 5
# listOfNo = [no for no in range(1,50) if no %5 ==0]
# print(listOfNo)
# # given a list of int create new list by each no + by 10
# plusTen = [no+10 for no in listOfNo ]
# print(plusTen)

# # create  a lsit of all vovels from a given str 
# vovels = [vov for words in fruits for vov in words if  vov.lower() in 'aeiou']
# print(vovels)
# #  extract all the words longer than three char from a listm
# longerThanThree = [word for word in fruits if len(word) >=3]
# print(longerThanThree)
# # extract all the pale word form the str 
# pal = [pale for pale in fruits if pale == pale[::-1]]
# print(pal)
# # create a list of nos fron 1 to 100 that are even ad divisible by 7
# evenAndDivisible = [no for no in listOfNo if no%2 == 0 and no%7 ==0]
# print(evenAndDivisible)
# # list comprensive 


# 


# jack list 
# a ack list a list of list where the linner list can have diiferent len unlike matrix whare all rows have same no of column 
# in other words a matrix is a rectagle rows into column a jacked list is like rows of diff size
# every low has 
# when are jaced lists are useful 
# represt 
# no of students calsses 
# callenders where months have diif dates 
# graph list where notes have diff list 
# 6


# Create a jagged list of integers like this:

jackedList = [ [1, 2, 3], [4, 5], [6, 7, 8, 9] ]
for i in range(3):
    print(jackedList[i])

# Write a program to print each element of a jagged list row by row.
for i in jackedList:
    for j in i:
        print(j , end=' ')
    print()

# Access and print the last element of each row in a jagged list.
for innerlist in jackedList:
    print(innerlist[len(innerlist)-1])

    # 4. Given a jagged list of student marks:
marks = [[80, 90], [75, 85, 95], [60]]
# Print the average marks of each student.

for innerList in marks:
    avg = sum(innerList)/len(innerList)
    print(avg)

    # 4. Store the names of students with their marks in a jagged list:
# marksWithName = [["Alice", 90, 85], ["Bob", 78], ["Charlie", 95, 88, 92]]
# Print the student with the highest average.

marksWithName = []
