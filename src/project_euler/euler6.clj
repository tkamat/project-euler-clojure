(ns project-euler.euler6)

(defn square-sum-difference
  [n]
  (- (int (Math/pow (reduce + (range 1 (inc n))) 2)) (int (reduce + (map #(Math/pow % 2) (range 1 (inc n)))))))
