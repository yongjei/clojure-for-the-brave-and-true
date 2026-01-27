(if true
    (do (println "Success!")
    	"By Zeus's hammer!")
    (do (println "Failure!")
    	"By Aquaman's trident!"))

(when true
  (println "Success!")
  "abra cadabra")

(nil? 1)
(nil? nil)

(if "bears eat beets"
  "bears beets Battlestar Galactica")
(if nil
  "This won't be the result because nil if falsey"
  "nil is falsey")

(= 1 1)
(= nil nil)
(= 1 2)

(or false nil :large_I_mean_venti :why_cant_I_just_say_large)
(or (= 0 1) (= "yes" "no"))
(or nil)

(and :free_wifi :hot_coffee)
(and :feelin_super_cool nil false)

(def failed-protagonist-names
  ["Larry Potter" "doreen the Exploere" "The Incredible Bulk"])

(def name "Chewbacca")
(str "\"Uggllglglglglglglll\" - " name)

{:first-name "Charlie"
 :last-name "McFishwish"}
{"string-key" +}
{name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}
(hash-map :a 1 :b 2)
(get {:a 0 :b 1} :b)
(get {:a 0 :b {:c "ho hum"}} :b)
(get {:a 0 :b 1} :c)
(get {:a 0 :b 1} :c "unicorn?")
(get-in {:a 0 :b {:c "ho hum"}} [:b :c])
({:name "The Human Coffeepot"} :name)

(:name {:name "The Human Coffeepot"})

(get [3 2 1] 0)
(get ["a" {:name "Pugsley Winsterbottom"} "c"] 1)
(vector "creepy" "full" "moon")
(conj [1 2 3] 4)

'(1 2 3 4)
(nth '(:a :b :c) 0)
(nth '(:a :b :c) 2)
(list 1 "two" {3 4})
(conj '(1 2 3) 4)

(hash-set 1 1 2 2)
(conj #{:a :b} :b)
(set [3 3 3 5 4])
(contains? #{:a :b} :a)
(contains? #{:a :b} 3)
(contains? #{nil} nil)

(or + -)
((or + -) 1 2 3)
((and (= 1 1) +) 1 2 3) ;; and는 첫번째 거짓 값 또는 마지막 참 값을 반환
((first [+ 0]) 1 2 3)

(map inc [1 2 3])
(map inc '(1 2 3))

(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiastic"
  [name]
  (str "HO. MY. GOD! " name " YOU ARE MOST DEFINITLEY LIKE THE BEST "
       "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))
(too-enthusiastic "Zelda")
(doc too-enthusiastic)

(defn x-chop
  "상대를 가격할 때 손으로 내려치는 종류를 기술함."
  ([name chop-type]
   (str "I " chop-type " chop " name "! Take that!"))
  ([name]
   (x-chop name "Karate")))

(x-chop "kanye West" "slap")
(x-chop "Kanye West")

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))
(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))

(codger "Billy" "Anne-Marie" "The Incredible Bulk")

(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: "
       (clojure.string/join ", " things)))

(favorite-things "Doreen" "gum" "shoes" "kara-te")

(defn my-first
  [[first-thing]]
  first-thing)

(my-first ["oven" "bike" "war-axe"])

(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "첫 번째 선택: " first-choice))
  (println (str "두 번째 선택: " second-choice))
  (println (str "나머지 선택은 무시할 겁니다. "
                "한탄할 만한 것은 이것들입니다: "
                (clojure.string/join ", " unimportant-choices))))

(chooser ["Marmalade", "Handsome Jack", "Pigpen", "Aquaman"])

(defn 보물-위치-공표
  [{lat :lat lng :lng}]
  (println (str "보물위치 위도: " lat))
  (println (str "보물위치 경도: " lng)))

(보물-위치-공표 {:lat 28.22 :lng 81.33})

(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])

(#(* % 3) 8)
(map #(str "Hi, " %)
     ["Darth Vader" "Mr. Magoo"])

(#(identity %&) 1 "blarg" :yip)

(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))
(def inc3 (inc-maker 3))

(inc3 7)


(def asym-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)})

(defn symmetrize-body-parts
  ":name과 :size를 갖는 일련의 맵을 가지고 있음."
  [asym-body-parts]
  (loop [remaining-asym-parts asym-body-parts final-body-parts []]
    (if (empty? remaining-asym-parts)
      final-body-parts
      (let [[part & remaining] remaining-asym-parts]
        (recur remaining
               (into final-body-parts
                     (set [part (matching-part part)])))))))

(symmetrize-body-parts asym-hobbit-body-parts)

(into [] (set [:a :a]))

(loop [iteration 0]
  (println (str "Iteration " iteration))
  (if (> iteration 3)
    (println "Goodbye")
    (recur (inc iteration))))

(defn recursive-printer
  ([]
   (recursive-printer 0))
  ([iteration]
   (println (str "Iteration " iteration))
   (if (> iteration 3)
     (println "Goodbye!")
     (recursive-printer (inc iteration)))))

(recursive-printer)

(defn my-reduce
  ([f initial coll]
   (loop [result initial
          remaining coll]
     (if (empty? remaining)
       result
       (recur (f result (first remaining)) (rest remaining)))))
  ([f [head & tail]]
   (my-reduce f head tail)))

(defn better-symmetrize-body-parts
  ":name과 :size 대응 관계를 갖는 배열을 기대함"
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts
                  (set [part (matching-part part)])))
          []
          asym-body-parts))

(defn hit
  [asym-body-parts]
  (let [sym-parts (better-symmetrize-body-parts asym-body-parts)
        body-part-size-sum (reduce + (map :size sym-parts))
        target (rand body-part-size-sum)]
    (loop [[part & remaining] sym-parts
           accumulated-size (:size part)]
      (if (> accumulated-size target)
        part
        (recur remaining (+ accumulated-size (:size (first remaining))))))))
