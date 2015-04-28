#include <iostream>

int main()
{
    for (int i = 1; i <= 100; i += 1) {
        if (i % 15 == 0) {
            std::cout << "FizzBuzz";
        } else if (i % 5 == 0) {
            std::cout << "Buzz";
        } else if (i % 3 == 0) {
            std::cout << "Fizz";
        } else {
            std::cout << i;
        }
        std::cout << std::endl;
    }
}
