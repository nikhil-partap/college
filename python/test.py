#  🍕 Pizza Builder — Challenge Steps
#
# 1. Define a Pizza class that stores:
#    - size, crust type, and a list of toppings
# 2. Add a method to add a new topping
# 3. Add a method to remove a topping if it exists
# 4. Add a method to print pizza details:
#    - size, crust, and all toppings (or “No toppings yet!”)
# 5. Create a pizza object, customize it, and print the summary

Toppings = ("electlicity" , "microcontrollers", "cpu", "gpu", "transistors")
class pizza:
    def __init__ (self, size, crust, topping = None):
        self.size = size    
        self.crust = crust
        self.topping = topping
    
    def addTopping(self):
        top = input(f'select the topping from {Toppings} : ')
        if top not in Toppings:
            print('please select the toppings from ', Toppings)
            # addTopping()
        else :
            self.topping = top
            
    def changeToppings(self):
        if self.topping :
            newTop = input(f'please select the new topping from {Toppings}')
            if newTop not in Toppings:
                print('please select the toppings from ', Toppings)
                # addTopping()
            else :
                self.topping = newTop
        else :
            print('there is no topping on the pizza you have to select one to change it')
            
    def printPizza(self):
        print(f'size of the pizza {self.size} \n crust of the pizza {self.crust} ')
        if self.topping :
            print(self.topping)
            print('all/more Toppings to add ', Toppings)
        else :
            print('No toppings yet!')
    

# Create and test a pizza
my_pizza = pizza("Large", "Thin", None)
my_pizza.printPizza()
