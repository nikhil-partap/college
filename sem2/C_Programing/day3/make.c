#include <stdio.h>
#include <stdbool.h>

int main() {
    int n;
    printf("Enter n: ");
    scanf("%d", &n);

    for (int num = n; num >= 2; num--) {
        bool isPrime = true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            printf("Largest prime <= %d is %d\n", n, num);
            break;
        }
    }

    return 0;
}
