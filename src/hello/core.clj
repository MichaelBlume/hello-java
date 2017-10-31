(ns hello.core)

(defn get-greeter [greeting]
  (reify hello.Greeter
    (greet [this target]
      (str greeting ", " target "!"))))
