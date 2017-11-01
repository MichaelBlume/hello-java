(ns hello.core-test
  (:import hello.HelloFrontend)
  (:require [clojure.test :refer :all]))

(deftest test-greeter
  (let [greeter (HelloFrontend/getGreeter "Hello")]
    (is (= "Hello, java!" (.greet greeter "java")))))
