(ns hello.core-test
  (:require [clojure.test :refer :all]))

(deftest test-greeter
  (let [greeter (hello.HelloFrontend/getGreeter "Hello")]
    (is (= "Hello, java!" (.greet greeter "java")))))
