// a mobile shop store (structure)
// brand , price , quantity 
// calculate total price for each and overall bill

// sample input 
// 2
// samsung 2 15000
// nokia 1 8000

// sample output 
// samsung 30000
// nokia 8000
// total 38000

#include<stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    struct mobile{
        char brand[20];
        int price;
        int quantity;
    }mobiles[n];
    for(int i = 0; i < n; i++){
        scanf("%s %d %d", mobiles[i].brand, &mobiles[i].price, &mobiles[i].quantity); 
    }
    int total = 0;
    for(int i = 0; i < n; i++){
        printf("%s %d\n", mobiles[i].brand, mobiles[i].price * mobiles[i].quantity);
        total += mobiles[i].price * mobiles[i].quantity;
    }
    printf("total %d\n", total);
    return 0;
}