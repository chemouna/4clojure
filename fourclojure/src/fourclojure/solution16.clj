(ns fourclojure.solution16)

(= (#(str "Hello, " % "!") "Dave") "Hello, Dave!")

(= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!")

(= (#(str "Hello, " % "!") "Rhea") "Hello, Rhea!")
