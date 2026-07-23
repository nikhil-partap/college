// simulate roling dice n times 
// 1. ask the user to enter a value n  - how many times to roll the dice
// generate and display the results of each roll
// after all rolls display the frequency of each number

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

    srand(time(NULL)); // seed the random number generator with the current time

    int n;
    printf("Enter the number of times to roll the dice: ");
    scanf("%d", &n);

    int rolls[n]; // array to store the results of each roll        
    for(int i = 0; i < n; i++){ // roll the dice n times
        rolls[i] = rand() % 6 + 1; // generate a random number between 1 and 6
        printf("Roll %d: %d\n", i+1, rolls[i]); // display the result of the roll
    }

    int frequency[6] = {0}; // array to store the frequency of each number
    for(int i = 0; i < n; i++){ // count the frequency of each number
        frequency[rolls[i] - 1]++;
    }
    for(int i = 0; i < 6; i++){ // display the frequency of each number
        printf("Number %d: %d times\n", i+1, frequency[i]);
    }
    return 0;
}