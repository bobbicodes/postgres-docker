{:dev-local {:env {:port "8080"
                   :database-type "postgresql"
                   :database-name "url_shortening_db_dev"
                   :database-username "postgres"
                   :database-password "mysecretpassword"
                   :database-host "localhost"
                   :database-port "8082"}}
 :test-local {:env {:port "9090"
                    :database-type "postgresql"
                    :database-name "url_shortening_db_test"
                    :database-username "postgres"
                    :database-password "mysecretpassword"
                    :database-host "localhost"
                    :database-port "8082"}}}