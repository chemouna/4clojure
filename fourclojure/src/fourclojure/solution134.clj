(ns fourclojure.solution134)

(true? ((fn [k m]
          (and (contains? m k)
               (nil? (get m k))))
        :a {:a nil :b 2}))

(false? ((fn [k m]
           (and (contains? m k)
                (nil? (get m k))))
         :b {:a nil :b 2}))

(false? ((fn [k m]
           (and (contains? m k)
                (nil? (get m k))))
         :c {:a nil :b 2}))
