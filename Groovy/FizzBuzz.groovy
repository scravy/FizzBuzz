(1..100).each{ number ->
    def isFizz = number % 3 == 0
    def isBuzz = number % 5 == 0

    if (isFizz)             print "fizz"
    if (isBuzz)             print "buzz"
    if (!isFizz && !isBuzz) print number

    println ""
}
