#include<stdio.h>
#include<stdbool.h>

int factorial(int n) {
    // 1. Base Case: If n is 0 or 1, the answer is 1. Stop here.
    if (n <= 1) {
        return 1;
    }

    // 2. Recursive Step: n * factorial of (n-1)
    return n * factorial(n - 1);
}


int main(){

    printf("give the n a value: \n");
    int n = 0;
    scanf(" %d", &n);
    printf(" %d\n", n);
    
    float result = 0;

    float fact = 1;
    float previous_num = 1;
    float numerator = 1;
    int first_run = true;

    for(int i = 0; i < n; i++){

        printf("the n is: %d \n", n);
        if (i+1== n){
            fact = 1;
        }else{
            fact = factorial(n-(i+1));
        }
        printf("the fact is: %f \n", fact);





        if(first_run){
            numerator = 1;
        }else{
            numerator = previous_num*2;
        }
        printf("the numerator is: %f \n", numerator);

        

        result += (numerator*numerator)/ fact;  // yaha the galti numerator *numerator nahi kar raha that ma baki ho gaya 

        printf("numerator: %f  ", numerator);
        printf("fact: %f  ", fact);
        printf("result: %f \n", result);

        
        
        previous_num = numerator  ;
        printf("the previous_num is: %f \n", previous_num);
        
        first_run = false;
    }
    printf("%f", result);

}




// if(first_run){
//             result += (1)/fact;
//         }else{
//             result += (previous_num*2)/fact;
//         }