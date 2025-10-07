#     1. You are given a tuple of student records:
students = (("Alice", 85), ("Bob", 72), ("Charlie", 90), ("Diana", 67))
# Write a program to print the name(s) of students who scored above average.

avg = 0
for student in students:
    avg += student[1] 
avg = avg/len(students)
print(avg)


for student in students:
    if student[1] >= avg:
        print(student[0])



#     3. Given a tuple of coordinates:
points = ((2, 3), (4, 1), (6, 5), (7, 8))
# Write a program to calculate the distance of each point from the origin (0,0) and return a tuple of distances.

distances = []

def Adistance(tupple):
    for point in points:
        distance = (point[0]**2 +point[1]**2)**0.5
        distances.append(distance)
        # for cor in point:
        
    print(distances)

Adistance(points)





# sets are used to store multiple item 
# is oneof the four built data type that is used to store colll
# the other three are list tupple and dictonary set items are unchangeable  but you can add or rremove a new item sets are written with 
# sets are unordered os you can not be sure in which order the item 









# the union and update methord join all the items of dboth sets 
# the intersection metjord keep only the dublicate 
# the differenc method keeps the item from the first set that are not inthe other set 
# the symmeteric_difference_() keeps all the items except the dublicate
