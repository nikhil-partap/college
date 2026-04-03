#include <stdio.h>

int main(int argc, char *argv[]){  // argc is the number of arguments and
//  argv is the arguments and it is an array of strings
    printf("the number of arguments is %d\n", argc);
    for(int i = 0; i < argc; i++){
        printf("the argument %d is %s\n", i, argv[i]);
    }
    return 0;
}

// eg ./out arg1 arg2 arg3
// the number of arguments is 4
// the argument 0 is ./out
// the argument 1 is arg1
// the argument 2 is arg2
// the argument 3 is arg3