(ns fourclojure.solution27)

(defn sol1 [coll]
  (= (seq coll) (reverse coll)))

(defn sol2 [coll]
  (= (apply str (reverse coll)) (apply str coll)))

(defn sol3 [coll]
  (= (vec coll) (rseq (vec coll))))

(defn sol4 [coll]
  (every? true? (map = coll (reverse coll))))

(defn sol5 [coll]
  (if (< (count coll) 2)
    true
    (and (= (first coll) (last coll)) (recur (rest (drop-last coll))))))

;(defn sol2 [coll]
;  (let [re (split-at (rem (count coll) 2) coll)]
;   (= (first res) (rest res))))

(false? (sol5 '(1 2 3 4 5)))
(true? (sol5 "racecar"))
(true? (sol5 [:foo :bar :foo]))
(true? (sol5 '(1 1 3 3 1 1)))
(false? (sol5 '(:a :b :c)))
