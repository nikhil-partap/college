#include<stdio.h>

void calculateSum(int a, int b){
    // int a = 3;
    // int b = 4;
    printf("the sum of %d and %d is %d", a, b, a+b);
}
void multiply(int a, int b){
    printf("the product of %d and %d is %d", a, b, a*b);
}


int main(int argc, char *argv){

    printf(" you have entered %d arguments\n", argc);

    for(int i = 0; i < argc; i++){
        printf("argument %d: %s\n", i, argv[i]);
    }
    
    // char input[50];
    // scanf("%s", &input);
    
    return 0;
}



