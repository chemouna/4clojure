(ns fourclojure.solution27)

(defn sol1 [coll]
  (= (seq coll) (reverse (seq coll))))

(false? (sol1 '(1 2 3 4 5)))
(true? (sol1 "racecar"))
(true? (sol1 [:foo :bar :foo]))
(true? (sol1 '(1 1 3 3 1 1)))
(false? (sol1 '(:a :b :c)))
