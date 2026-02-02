(ns pegthing.core
  (:require [clojure.set :as set])
  (:gen-class))

(declare successful-move prompt-move game-over query-rows)

(defn tri*
  "삼각수의 늦은 배열 만들기"
  ([] (tri* 0 1))
  ([sum n]
   (let [new-sum (+ sum n)]
     (cons new-sum (lazy-seq (tri* new-sum (inc n)))))))

(def tri (tri*))

(defn trianglar?
  "주어진 숫자가 1, 3, 6, 10, 15 등과 같은 삼각수인지 판정"
  [n]
  (= n (last (take-while #(>= n %) tri))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
