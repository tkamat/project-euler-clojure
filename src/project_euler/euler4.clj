(ns project-euler.euler4)

(defn is-palindrome?
  [n]
  (= (str n) (apply str (reverse (str n)))))
(defn calc-largest-palindrome
  [l u]
  (apply max (filter is-palindrome? (mapcat #(map (partial * %) (range l u)) (range l u)))))
