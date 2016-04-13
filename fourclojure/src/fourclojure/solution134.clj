(ns fourclojure.solution134)

(defn contains-nil-val? [k m]
          (and (contains? m k)
               (nil? (get m k))))

(true? (contains-nil-val?
        :a {:a nil :b 2}))

(false? (contains-nil-val? :b {:a nil :b 2}))

(false? (contains-nil-val? :c {:a nil :b 2}))
