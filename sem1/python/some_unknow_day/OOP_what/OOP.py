# What is OOP?
# Object-Oriented Programming (OOP) is a way of designing code so you group related functions and data together (using classes 
# and objects).

# Why use OOP in Python?
# Python is object-oriented, meaning you can use classes to structure your code for clarity and power.

# Benefits:
# Keeps code organized and clear.
# Easier to maintain, reuse, and debug.
# You follow the DRY (Don’t Repeat Yourself) principle—less repetition, more reuse.
# Lets you build bigger, more complex apps with less code.
# | Concept | Meaning                                                                              |
# | ------- | ------------------------------------------------------------------------------------ |
# | Class   | A blueprint for objects. Defines what an object looks like (its data and functions). |
# | Object  | An instance of a class. Real data created using the class blueprint.                 |
# Example:
class Car:
    def __init__(self, brand):
        self.brand = brand

    def drive(self):
        print(self.brand, "is driving.")

my_car = Car("Honda")
my_car.drive()  # Output: Honda is driving.




# Classes and Core OOP Concepts:
# Class:
# A class is a blueprint or template for creating objects. It defines what attributes (data) and methods (functions)
#  the objects will have.

# Object:
# An object is an instance of a class. When you create an object, you are making a real, usable version 
# based on the class design.

# When you create an object:
# You are making an instance of the class.
# The object gets its own copy of the attributes and can use the methods defined in the class.

# Example:
class Dog:
    def __init__(self, name):
        self.name = name

    def bark(self):
        print(self.name, "says woof!")

my_dog = Dog("divyam")  # Creating an object
my_dog.bark()  # Output: Rocky says woof!
