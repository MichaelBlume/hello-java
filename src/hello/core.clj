(ns hello.core
  (:import hello.Greeter))

(defn get-greeter [greeting]
  (reify Greeter
    (greet [this target]
      (str greeting ", " target "!"))))
