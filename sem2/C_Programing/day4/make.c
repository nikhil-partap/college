#include<stdio.h>

int main(){
    int no ;
    printf("no: ");
    scanf("%d", &no);

    (no % 2 == 0) ? printf("even") : printf("odd");

}