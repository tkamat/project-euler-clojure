(ns project-euler.euler1)

(defn sum-multiples-of-3-and-5-below-n
  [n]
  (apply + (filter (fn [x] (or (= 0 (mod x 3)) (= 0 (mod x 5)))) (take (- n 1) (iterate inc 1)))))
