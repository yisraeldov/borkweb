(ns routes
  (:require
   [ruuter.core :as ruuter]
   [utils.response :as r]
   [view.index :as index]
   [view.login :as login]
   [view.profile :as profile]
   [view.register :as register]))

(def routes
  #(ruuter/route 
    [{:path "/"
      :method :get
      :response index/page}
     {:path "/register"
      :method :get
      :response register/index}
     {:path "/register"
      :method :post
      :response register/save}
     {:path "/login"
      :method :get
      :response login/index}
     {:path "/login"
      :method :post
      :response login/login}
     {:path "/logout"
      :method :get
      :response login/logout}
     {:path "/profile"
      :method :get
      :response profile/index}]
   %))
