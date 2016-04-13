(ns fourclojure.solution156)

; (zipmap  [:a :b :c] (repeat 0))

(= (#(zipmap %2 (repeat %1)) 0 [:a :b :c]) {:a 0 :b 0 :c 0})

(= (#(zipmap %2 (repeat %1)) "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})

(= (#(zipmap %2 (repeat %1)) [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})


;; solution 2
(defn sol2 [v coll]
  (into {} (for [x coll] {x v})))

;; solution 3
(defn sol3 [v coll]
  (into {} (map vector coll (repeat v))))

;; solution 4
(defn sol4 [v coll]
  (apply assoc {} (interleave coll (repeat v))))

;; solution 5
(defn sol5 [v coll]
  (zipmap coll (repeat (count coll) v)))

;; solution 6
(defn sol6 [v coll]
  (apply hash-map (interleave coll (repeat v))))

;; solution 7
(defn sol7 [v coll]
  (reduce
   (fn [acc i] (conj acc [i v]))
   {}
   coll))

(= (sol7 0 [:a :b :c]) {:a 0 :b 0 :c 0})

(= (sol7 "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})

(= (sol7 [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})

