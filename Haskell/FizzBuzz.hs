main :: IO ()
main = mapM_ (putStrLn . fizzbuzz) [1..100]
  where
    divides d = (== 0) . (flip rem d)
    fizzbuzz x
        | 15 `divides` x = "FizzBuzz"
        | 5  `divides` x = "Buzz"
        | 3  `divides` x = "Fizz"
        | otherwise = show x
