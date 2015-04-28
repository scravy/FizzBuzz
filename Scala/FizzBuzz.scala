object FizzBuzz {
  def main(args: Array[String]) {
    (1 to 100).map( x => {
      if (x % 15 == 0) {
        println("FizzBuzz")
      } else if (x % 5 == 0) {
        println("Buzz")
      } else if (x % 3 == 0) {
        println("Fizz")
      } else {
        println(x)
      }
    })
  }
}
