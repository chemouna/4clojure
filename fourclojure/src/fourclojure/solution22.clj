(ns fourclojure.solution22)

;(reduce + 0 (map 1 [1 2 3 4]))
;((reduce (fn [x y] (inc x)) 0) '(1 2 3 5))

;; solution 1
(defn sol1 [coll]
  (reduce (fn [x y] (inc x)) 0 coll))

;; solution 2
(defn sol2 [coll]
  (reduce (fn [c _] (inc c)) 0 coll))

;; solution 3
(defn sol3 [coll]
  (#(if (empty? %1)
               %2
               (recur (rest %1) (inc %2)))
               coll
               0))

;; solution 4
(defn sol4 [coll]
  (reduce + (map (constantly 1) coll)))


(= (sol4 '(1 2 3 3 1)) 5)

(= (sol4 "Hello World") 11)

(= (sol1 [[1 2] [3 4] [5 6]]) 3)

(= (sol1 '(13)) 1)

(= (sol1 '(:a :b :c)) 3)
