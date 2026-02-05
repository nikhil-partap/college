# # Final Practice Paper
# # Q1. Student Pass or Fail (Baseline Question)
# # Problem Statement:
# # A college declares a student PASS if marks in all 3 subjects are at least 40. Otherwise, the
# # student is FAIL.
# # Write a program to read marks of 3 subjects and print the result.
# # Input Format:
# # One line with 3 integers: m1 m2 m3
# # Output Format:
# # A single word: PASS or FAIL

# marks = list(map(int , input().split()))

# for mark in marks :
#     if mark < 40:
#         print("FAIL")
# print("PASS")




# # Problem Statement:
# # Read a string and count how many vowels (a, e, i, o, u) it contains.
# # Input Format:
# # One string
# # Output Format:
# # Integer count of vowels

# words = input().lower()
# vowels = "aeiou"
# count = 0
# for word in words:
#     if word in vowels:
#         count += 1



# Q10. Fibonacci Series (First n Terms)
# Problem Statement:
# Generate and print the first n terms of the Fibonacci series.
# Input Format:
# One integer n
# Output Format:
# Print Fibonacci numbers separated by space

# n = int(input())
# a , b = 0 , 1

# for i in range(n):
#     print(a , end=" ")
#     a , b = b , a+b


# N = int(input()) 
# sums = 0
# i = 0
# while i <= N:
#     sums += i
#     i += 1
# print(sums)


# class animal:
#     def speak(self):
#         print("Animal makes sound")
    
# class Dog(animal):
#     def speak(self):
#         print("Dog bark")

# d = Dog()
# d.speak()


# class Person:
#     def __init__(self, name):
#         self.name = name

# class Student(Person):
#     def __init__(self, name, roll):
#         super().__init__(name)
#         self.roll = roll

# name = "Nikhil"
# roll = 123
# s = Student(name, roll)
# print(s.name, s.roll)


class Student:
    def __init__(self, name, marks):
        self.name = name 
        self.marks = marks

name = "Nikhil"
marks = 342

s = Student(name , marks)

print(s.name, s.marks)
