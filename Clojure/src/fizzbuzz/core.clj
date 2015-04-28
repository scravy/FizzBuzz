(ns fizzbuzz.core
  (:gen-class))

(defn fizzbuzz
  "Do the FizzBuzz"
  [x]
  (cond
    (= 0 (rem x 15)) "FizzBuzz"
    (= 0 (rem x 5))  "Buzz"
    (= 0 (rem x 3))  "Fizz"
    :else x)
)

(defn -main
  "This is FizzBuzz in Clojure."
  [& args]
  (doall (map (comp println fizzbuzz) (range 1 101)))
)
