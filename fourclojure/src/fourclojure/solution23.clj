(ns fourclojure.solution23)

(defn sol1 [coll]
  (reduce conj () coll))

(defn sol2 [coll]
  (reduce #(conj %1 %2) '() coll))

(defn sol3 [coll]
  (apply conj () coll))

(defn sol4 [coll]
  (into () coll))

(= (sol4 [1 2 3 4 5]) [5 4 3 2 1])
(= (sol4 (sorted-set 5 7 2 7)) '(7 5 2))
(= (sol4 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

