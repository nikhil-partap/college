#     # 1. You are given a tuple of student records:
# students = (("Alice", 85), ("Bob", 72), ("Charlie", 90), ("Diana", 67))
# # Write a program to print the name(s) of students who scored above average.

# avg = 0

# for student in students:
#     avg += student[1]
#     # print(avg)
# avg =  avg/len(students)

# # print(avg)

# for student in students:
#     if student[1] >= avg :
#         print(student[0])




    # 2. A tuple contains sales data for 7 days:
sales = (1200, 1500, 1000, 1800, 2000, 1700, 1600)
# Write a function to return the day number with maximum sales.

def maxSale(sale):
    maxSaleValue = max(sale)
    return sale.index(maxSaleValue)+1

print(maxSale(sales))



    # 3. Given a tuple of coordinates:
points = ((2, 3), (4, 1), (6, 5), (7, 8))
# Write a program to calculate the distance of each point from the origin (0,0) and return a tuple of distances.

tup = tuple()