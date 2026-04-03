#include<stdio.h>
#include<math.h>

void triangleArea(float x , float y, float z){
    float s= (x+y+z)/2;
    float area = sqrt(s*(s-x)*(s-y)*(s-z));
    printf("%.2f\n", area);
}


int main(){
    float x[3];

    for(int i =0 ; i < 3; i++){
        scanf("%f", &x[i]);
    }
    triangleArea(x[0], x[1], x[2]);
    
    return 0;
}
