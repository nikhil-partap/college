#include<stdio.h>
#include<math.h>

void area(float x){
    float area = 3.14*x*x;
    printf("%.2f\n", area);
}
int circumference(float x){
    float circumference = 2*3.14*x;
    return circumference;
}

int main(){
    float r;
    scanf("%f", &r);
    area(r);
    float c = circumference(r); 
    printf("%.2f\n", c);
    return 0;
}
