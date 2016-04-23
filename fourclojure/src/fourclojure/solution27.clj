(ns fourclojure.solution27)

(defn sol1 [coll]
  (= (seq coll) (reverse coll)))

(defn sol2 [coll]
  (= (apply str (reverse coll)) (apply str coll)))

(defn sol3 [coll]
  (= (vec coll) (rseq (vec coll))))

;(defn sol2 [coll]
;  (let [re (split-at (rem (count coll) 2) coll)]
;   (= (first res) (rest res))))

(false? (sol3 '(1 2 3 4 5)))
(true? (sol3 "racecar"))
(true? (sol3 [:foo :bar :foo]))
(true? (sol3 '(1 1 3 3 1 1)))
(false? (sol3 '(:a :b :c)))
