<?php

function fizzbuzz($from, $to) {
    for ($i = $form; $i <= $to; $i += 1) {
        if ($i % 15 == 0) {
            echo "FizzBuzz\n";
        } elseif ($i % 5 == 0) {
            echo "Buzz\n";
        } elseif ($i % 3 == 0) {
            echo "Fizz\n";
        } else {
            echo "$i\n";
        }
    }
}

fizzbuzz(1, 100);

