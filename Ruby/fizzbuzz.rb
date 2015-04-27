def fizzbuzz(from, to)
    (from..to).each { |i|
        case 0
        when i % 15
            puts "FizzBuzz"
        when i % 5
            puts "Buzz"
        when i % 3
            puts "Fizz"
        when 0
            puts i
        end
    }
end

fizzbuzz 1, 100
