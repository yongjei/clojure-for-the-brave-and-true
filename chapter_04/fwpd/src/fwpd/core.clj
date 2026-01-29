(ns fwpd.core
  (:require [clojure.java.io :as io]))

(def filename (io/resource "suspects.csv"))
(def content (slurp filename))

(defn -main
  "Reads and prints the suspects CSV file."
  [& args]
  (println content))
(slurp filename)

(def vamp-keys [:name :glitter-index])

(defn str->int
  [str]
  (Integer. str))

(def conversions {:name identity
                  :glitter-index str->int})

(defn convert
  [vamp-key value]
  ((get conversions vamp-key) value))

(convert :glitter-index "3")
