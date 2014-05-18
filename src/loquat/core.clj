(ns loquat.core
  (:use [compojure.core]
        [ring.adapter.jetty]))


; Routing
(defroutes main-routes
  (GET "/" [] "Hello World"))


; Server
