(ns project-euler.euler10)

(defn calculate-primes [n]
  (let [root (-> n (Math/sqrt) inc int)
        sieve (boolean-array n true)]
    (loop [i 2]
      (when (< i (Math/sqrt n))
        (when (aget sieve i)
          (loop [j (* i 2)]
            (when (< j n)
              (aset sieve j false)
              (recur (+ j i)))))
        (recur (inc i))))
    (filter #(aget sieve %) (range 2 n))))
(apply + (primes 2000000)) 
