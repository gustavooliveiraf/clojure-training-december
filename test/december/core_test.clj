(ns december.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [december.core :refer [data]]))

(defn a-test-func
  [data username]
  data)

(deftest a-test
  (testing "FIXME, I fail - Select the email domain of a user"
    (is (= "april.biz" (a-test-func data "Bret")))))
