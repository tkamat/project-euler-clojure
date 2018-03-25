(ns project-euler.euler3)

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

(defn calc-prime-factors
  [n]
  (def all-prime-numbers (generate-prime-numbers (int (Math/sqrt n))))
  (loop [num n
         remaining-primes all-prime-numbers
         prime-divisor 2
         prime-factors []]
    (cond (empty? remaining-primes)
          (if (> num 1)
            (conj prime-factors num)
            prime-factors)
          (= 0 (mod num prime-divisor))
          (recur (/ num prime-divisor)
                 (take-while #(<= % (int (Math/sqrt (/ num prime-divisor)))) remaining-primes)
                 prime-divisor
                 (conj prime-factors prime-divisor))
          :else
          (recur num
                 (rest remaining-primes)
                 (first (rest remaining-primes))
                 prime-factors))))

