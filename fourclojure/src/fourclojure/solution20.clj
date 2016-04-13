(ns fourclojure.solution20)

;; solution 1 
(defn sol1 [coll]
  (first(drop (- (count coll) 2) coll)))

;; solution 2
(defn sol2 [coll]
  (nth coll (- (count coll) 2)))

;; solution 3
(defn sol3 [coll]
  (comp second reverse coll))

(= (sol3 (list 1 2 3 4 5)) 4)

(= (sol2 ["a" "b" "c"]) "b")

(= (sol1 [[1 2] [3 4]]) [1 2])
