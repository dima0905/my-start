;;
;;
(ns my-start.core
  (:require
   [ring.adapter.jetty :as jetty]))
;   [my-start.dummy.hello :as hello]))
;
(defn -main [port]
  (jetty/run-jetty
   (fn [req]
     {:status 200
      :body "<h1>123123213</h1>"
      :headers {}})
   {:ssl? true
    :keystore "D://Clojure/patio/patio.pkcs12"
    :keystore-type "PKCS12"
    :key-password "Vorona0905"}))
  
