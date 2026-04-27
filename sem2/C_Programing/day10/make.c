// enum
// all enum character have a index value 
// the value you assign to a var should be in enum 

#include <stdio.h>

enum Level {
    LOW = 5,
    MEDIUM,
    HIGH
};


// union 
// union is a collection of variables of different types that share the same memory location    
// the size of the union is the size of the largest variable in the union
union MyUnion {
    int x;
    float y;
    char z;
};


int main(){

    union MyUnion u1;
    u1.x = 10;
    u1.y = 20.5;
    u1.z = 'a';

    printf("%d\n", u1.x);  // the value printed will be the last value assigned to the union in this case it is 10
    printf("%f\n", u1.y);  // 20.500000
    printf("%c\n", u1.z);  // a

    // enum Level myVar = MEDIUM;

    // printf("%d", myVar);   // 6
    return 0;
}