(ns project-euler.euler9)

(time (loop [a 1
             b 1
             c 1]
        (cond (and (= (+ a b c) 1000) (= (+ (Math/pow a 2) (Math/pow b 2)) (Math/pow c 2)))
              (* a b c)
              (> a 500)
              (recur 1 (inc b) c)
              (> b 500)
              (recur 1 1 (inc c))
              (> c 500)
              0
              :else
              (recur (inc a) b c))))
