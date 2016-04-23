(ns fourclojure.solution27)

(defn sol1 [coll]
  (= (seq coll) (reverse coll)))

(defn sol2 [coll]
  (= (apply str (reverse coll)) (apply str coll)))

;(defn sol2 [coll]
;  (let [re (split-at (rem (count coll) 2) coll)]
;   (= (first res) (rest res))))

(false? (sol2 '(1 2 3 4 5)))
(true? (sol2 "racecar"))
(true? (sol1 [:foo :bar :foo]))
(true? (sol1 '(1 1 3 3 1 1)))
(false? (sol1 '(:a :b :c)))
