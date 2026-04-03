#include<stdio.h>
#include<math.h>

void distance(float x, float y, float a, float b){
    float distance = sqrt((x-a)*(x-a) + (y-b)*(y-b));
    printf("%.2f\n", distance);
}

int main(){
    float x[4];

    for(int i =0 ; i < 4; i++){
        scanf("%f", &x[i]);
    }
    
    distance(x[0], x[1], x[2], x[3]);
    return 0;

}

