#include<stdio.h>

void input(){
    // int a = 3;
    // int b = 4;
    int numbers[5];
    for(int i = 0; i < 5; i++){
        scanf("%d", &numbers[i]);
    }
    int even_count = 0;
    int odd_count = 0;
    for(int i = 0; i < 5; i++){
        if(numbers[i] %2 == 0){
            even_count++;
        } else {
            odd_count++;
        } 
    }
    printf("the number of even numbers is %d\n", even_count);
    printf("the number of odd numbers is %d\n", odd_count);
}


int main(){

    input();
    return 0;
}



