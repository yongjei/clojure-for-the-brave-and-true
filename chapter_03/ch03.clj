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
