(ns mfoem.em-ont
  (:use [tawny.owl]
        [tawny.reasoner])
  (:require [clojure.string :as str]
            [tawny owl read]))

(tawny.read/defread MFOEM
  :location (tawny.owl/iri (clojure.java.io/resource "MFOEM.owl"))
  :prefix "em-ont:"
  :iri "http://purl.obolibrary.org/obo/MFOEM.owl"
  :filter (partial
           tawny.read/iri-starts-with-filter
           "http://purl.obolibrary.org/obo/MFOEM")
  :transform #'tawny.read/label-transform)
