(ns fourclojure.solution24)

;; solution 1
(defn sol1 [coll]
  (reduce + 0 coll))

(= (sol1 [1 2 3]) 6)

(= (sol1 (list 0 -2 5 5)) 8)

(= (sol1 #{4 2 1}) 7)

(= (sol1 '(0 0 -1)) -1)

(= (sol1 '(1 10 3)) 14)
