#include <stdio.h>

int main(void) {

    for (int i = 1; i <= 100; i++) {
        if (i % 15 == 0) {
            puts("FizzBuzz");
        } else if (i % 5 == 0) {
            puts("Buzz");
        } else if (i % 3 == 0) {
            puts("Fizz");
        } else {
            printf("%d\n", i);
        }
    }

}
