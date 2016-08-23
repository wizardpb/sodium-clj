(ns sodium-clj.helpers
  (:import (nz.sodium Lambda0 Lambda1 Stream Handler Lambda2 Lambda3 Lambda4 Lambda5 Lambda6)))

(defn ->Lambda0 [fn]
  (proxy [Lambda0] []
    (apply [] (fn))))

(defn ->Lambda1 [fn]
  (proxy [Lambda1] []
    (apply [a] (fn a))))

(defn ->Lambda2 [fn]
  (proxy [Lambda2] []
    (apply [a b] (fn a b))))

(defn ->Lambda3 [fn]
  (proxy [Lambda3] []
    (apply [a b c] (fn a b c))))

(defn ->Lambda4 [fn]
  (proxy [Lambda4] []
    (apply [a b c d] (fn a b c d))))

(defn ->Lambda5 [fn]
  (proxy [Lambda5] []
    (apply [a b c d e] (fn a b c d e))))

(defn ->Lambda6 [fn]
  (proxy [Lambda6] []
    (apply [a b c d e f] (fn a b c d e f))))


