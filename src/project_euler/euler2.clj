(ns project-euler.euler2)

(defn gen-fibbonacci-sequence
  [n]
  (last (take-while #(< (last %) n) (iterate (fn [nums] (conj nums (+ (last nums) (first (rest (reverse nums)))))) [1 2])))) 
(apply + (filter even? (gen-fibbonacci-sequence 4000000))) 
