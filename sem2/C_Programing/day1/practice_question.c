#include <stdio.h>
#include <string.h>

int main(){

    int no ;
    scanf("%d", &no);
    int marks[100];
    char grace[60][60];

    for(int i = 0; i < no; i ++){
        scanf("%d", &marks[i]);

        if(marks[i] <= 39 && marks[i] >= 35){
            // sprintf(grace[i], "%d" , 42 - marks[i]) ; 
            marks[i] = 42;
        } else {
            grace[1][i] = 'N';
        }

        if(marks[i] < 40){
            grace[2][i] = 'F';
        }else if (marks[i] < 60){
            grace[2][i] = 'D';
        }else if (marks[i] < 60){
            grace[2][i] = 'C';
        }else if (marks[i] < 60){
            grace[2][i] = 'B';
        }else {
            grace[2][i] = 'A';
        }

        printf("Student %d: Marks=%d Percentage=%d Grade=%c \n" , (i+1) , marks[i], marks[i], grace[2][i] );

    }

    return 0;
}