(ns config-testing.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [config-testing.core-test]))

(enable-console-print!)

(doo-tests 'config-testing.core-test)
