(ns fourclojure.solution134)

(defn contains-nil-val? [k m]
          (and (contains? m k)
               (nil? (m k))))

(true? (contains-nil-val?
        :a {:a nil :b 2}))

(false? (contains-nil-val? :b {:a nil :b 2}))

(false? (contains-nil-val? :c {:a nil :b 2}))

;; or with a shorter way
(false? (#(and (contains? %2 %1)
               (nil? (%2 %1)))
        :b {:a nil :b 2}))

