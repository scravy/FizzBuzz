import sys

def fizzbuzz(start, to):
    for x in range(start, to + 1):
        if x % 15 == 0:
            sys.stdout.write("FizzBuzz\n");
        elif x % 5 == 0:
            sys.stdout.write("Buzz\n");
        elif x % 3 == 0:
            sys.stdout.write("Fizz\n");
        else:
            sys.stdout.write(str(x) + "\n");

fizzbuzz(1, 100);
