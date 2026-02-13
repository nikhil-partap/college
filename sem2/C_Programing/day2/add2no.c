// gcc -Wall -Wextra -g add2no.c -o add2no.exe
// execution cmd 

#include <stdio.h>

int main() {
    int a, b, sum;  // declared but not initialized

    // Print them directly without assigning values
    printf("Garbage values: a = %d, b = %d, sum = %d\n", a, b, sum);

    return 0;
}

// this program will not run because gcc will not allow you to do it 
// if you want to run this you have to disable the optimization so GCC for that 
// run   gcc -O0 -Wall -Wextra -g add2no.c -o add2no.exe
// -O0 disables optimization so GCC won’t “helpfully” zero things out.


// well i cannot run this the gcc compiler will not let me shoot me in my foot 