(ns december.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [december.core :refer [data]]))

(defn a-test-func
  [data username]
  data)

(deftest a-test
  (testing "FIXME, I fail - Select the email domain of a user"
    (is (= "april.biz" (a-test-func data "Bret")))))

(defn full-address
      [data]
      data)

(deftest b-test
         (testing "Add a “full-address” field to a user map"
                  (is (full-address data))))

(defn update-website
      [data id new-site]
      data)

(deftest c-test
         (testing "Update a user’s website by id"
                  (is (update-website data id "new-site.com"))))

(defn order-by-
      [data]
      data)

(deftest d-test
         (testing "Sort in ascending order by lat and if the lat is same, order by id"
                  (is (order-by- data))))

(defn compose-cond
      [data]
      (let [output data]
           (prn output)
           true))

(deftest e-test
         (testing "Compose a function to extract latitude as a number and use cond-> to enrich the user map based on its value"
                  (is (compose-cond data))))
