(ns fourclojure.solution19)

(= (#(first(reverse %)) [1 2 3 4 5]) 5)

(= (#(first(reverse %)) '(5 4 3)) 3)

(= (#(first(reverse %)) ["b" "c" "d"]) "d")


;; solution 2
(defn sol2 [coll]
  (.get coll(- (count coll) 1)))

;; solution 3
(defn sol3 [coll]
  (nth coll (dec (count coll))))

;; solution 4
(defn sol4 [coll]
  (reduce (fn [a b] b) coll))

;; solution 5
(defn sol5 [[n & more]]
  (if more
    (recur more) n))

(= (sol5 [1 2 3 4 5]) 5)

(= (sol5 '(5 4 3)) 3)

(= (sol2 ["b" "c" "d"]) "d")



