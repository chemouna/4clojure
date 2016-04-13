(ns fourclojure.solution21)

;; solution 1
(defn nth-elt-1 [coll n]
  ((vec coll) n))

;; solution 2
(defn nth-elt-2 [coll n]
   (first (drop n coll)))

;; solution 3
(defn nth-elt-3 [coll n]
  (if (zero? n)
    (first coll)
    (recur (rest coll) (- n 1))))

;; solution 4
(defn nth-elt-4 [coll n]
  (loop [s coll i n]
   (if (= i 0) (first s)
       (recur (next s) (dec i)))))

;; solution 5
(defn nth-elt-5 [coll n]
  (first (nthrest coll n)))

;; solution 6
(defn nth-elt-6 [coll n]
  (last (take (+ n 1) coll)))

;; solution 7
(defn nth-elt-7 [coll n]
  (first (nthnext coll n)))

;; solution 8
(defn nth-elt-8 [coll n]
  (->> coll (take (inc n)) last))

;; solution 9
(defn nth-elt-9 [coll n]
  (last (take (+ n 1) (seq coll))))

(= (nth-elt-9 '(4 5 6 7) 2) 6)

(= (nth-elt-9 [:a :b :c] 0) :a)

(= (nth-elt-1 [1 2 3 4] 1) 2)

(= (nth-elt-1 '([1 2] [3 4] [5 6]) 2) [5 6])
