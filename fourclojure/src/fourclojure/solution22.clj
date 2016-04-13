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

;; solution 5
(defn sol5 [coll]
  (loop [s coll c 0]
   (if (empty? s) c
       (recur (next s) (inc c)))))

;; solution 6
(defn sol6 [coll]
  (reduce + (map (fn [_] 1) (seq coll))))

;; solution 7
(defn sol7 [coll]
  (-> coll (interleave (range)) last inc))

;; solution 8
(defn sol8 [coll]
  (.size (vec coll)))

;; solution 9
(defn sol9 [coll]
  (apply + (map (fn [_] 1) coll)))

(= (sol9 '(1 2 3 3 1)) 5)

(= (sol9 "Hello World") 11)

(= (sol9 [[1 2] [3 4] [5 6]]) 3)

(= (sol9 '(13)) 1)

(= (sol9 '(:a :b :c)) 3)
