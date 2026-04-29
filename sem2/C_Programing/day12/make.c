#include<stdio.h>

int main(){

    int input_no;
    scanf("%d", &input_no);

    for(int i = 0; i < input_no; i++){
    char name[100];
    int salary;
    int experience;

    scanf("%s %d %d", name, &salary, &experience);
    if(experience >= 5){
        salary += (int)(salary * 0.2);
    }else if(experience >= 2){
        salary += (int)(salary * 0.1);
    }
    // tax 
    if(salary > 50000){
        salary -= (int)(salary * 0.1);
        
    }

    if (experience > 10){
            salary += 3000;
        }

    printf("%s %d", name, salary);
    }
    return 0;
}
        
// sample input and output 
// input -amit 60000 6 output - amit 64800;
