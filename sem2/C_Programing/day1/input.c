#include <stdio.h>
int main(){
    int i , j ,k ;
    printf("Please enter teo no to add:");
    scanf("%d", &i);   // & fetch the memory address of the variable
    scanf("%d", &j);

    k = i + j;
    printf("/n");
    
    printf("the address value of i , j , k is : %p %p %p\n", (void *)&i, (void *)&j, (void *)&k);
    
    printf("the value of the sum is %d ", k);
    return 0 ;
}

// gcc -Wall -Wextra -g day1.c -o day1.exe
// execution cmd 