(ns fourclojure.solution145)

(= '(1 5 9 13 17 21 25 29 33 37)
   (for [x (range 40)
            :when (= 1 (rem x 4))]
        x))

(= '(1 5 9 13 17 21 25 29 33 37)
   (for [x (iterate #(+ 4 %) 0)
            :let [z (inc x)]
            :while (< z 40)]
        z))

(= ' (1 5 9 13 17 21 25 29 33 37)
     (for [[x y] (partition 2 (range 20))]
        (+ x y)))

;; (1 5 9 13 17 21 25 29 33 37)
