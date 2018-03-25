(ns project-euler.euler7)

(defn generate-prime-numbers
  [n]
  (map first
       (filter
        #(not-any? (fn [x] (= x 0)) %)
        (map
         (fn
           [x]
           (cons x (map #(mod x %) (take (- (int (Math/sqrt x)) 1) (iterate inc 2)))))
         (take-while #(<= % n) (cons 2 (iterate (partial + 2) 3)))))))
(defn get-nth-prime
  [n]
  (last (take n (generate-prime-numbers 100000000))))
