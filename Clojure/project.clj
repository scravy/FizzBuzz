(defproject fizzbuzz "1.0.0"
  :description "FizzBuzz in Clojure"
  :url "https://github.com/scravy/FizzBuzz"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot fizzbuzz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
