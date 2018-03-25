(ns project-euler.euler12)

(defn nth-tri-num
  [n]
  (apply + (range 1 (inc n))))
(defn all-tri-nums
  ([] (all-tri-nums 1))
  ([x] (lazy-seq (cons (nth-tri-num x) (all-tri-nums (inc x)))))) 
(defn num-factors
  [x]
  (inc (* 2 (count (filter #(= % 0) (map #(mod x %) (range 1 (Math/sqrt x))))))))
(first (drop-while #(< (num-factors %) 500) (drop 12000 (all-tri-nums)))) 
