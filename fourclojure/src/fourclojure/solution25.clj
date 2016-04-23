(ns fourclojure.solution25)


(= (filter odd? #{1 2 3 4 5}) '(1 3 5))
(= (filter odd?  [4 2 1 6]) '(1))
(= (filter odd? [2 2 4 6]) '())
(= (filter odd? [1 1 1 3]) '(1 1 1 3))

(defn sol2 [col]
  (filter #(== 1 (rem % 2)) col))

(defn sol3 [col]
  (filter #(== (mod % 2) 1) col))

(defn sol4 [col]
  (for [x col :when (odd? x)] x))

(= (sol4 #{1 2 3 4 5}) '(1 3 5))

(= (sol4 [4 2 1 6]) '(1))

(= (sol3 [2 2 4 6]) '())

(= (sol3 [1 1 1 3]) '(1 1 1 3))
