(ns fourclojure.solution23)

(defn sol1 [coll]
  (reduce conj () coll))

(defn sol2 [coll]
  (reduce #(conj %1 %2) '() coll))

(= (sol2 [1 2 3 4 5]) [5 4 3 2 1])
(= (sol2 (sorted-set 5 7 2 7)) '(7 5 2))
(= (sol2 [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

