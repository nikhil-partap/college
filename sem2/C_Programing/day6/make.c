#include<stdio.h>

float tocelcius(float temp){
    return (5.0/9.0)*(temp-32.0);
}
float tofaren(float temp){
    return (temp*9/5)+32;
}

int main(int argc, char *argv){
    
    int no= 0;
    printf("enter 1 to convert cel to far and 2 to convert far to cel: ");
    scanf("%d", &no);

    if (no == 1){
        float temp;
        scanf("%f",&temp);
        printf("%f", tofaren(temp));

    }else if (no == 2){
        float temp;
        scanf("%f",&temp);
        printf("%f", tocelcius(temp));
    }
    
    return 0;
}



