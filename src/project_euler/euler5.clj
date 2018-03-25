(ns project-euler.euler5)

(defn calc-smallest-multiple-of-2-to-20
  []
  (loop [num 9699690]
    (if (every? #(= 0 %) (map #(mod num %) (range 2 20)))
      num
      (recur (+ num 9699690))))) 
