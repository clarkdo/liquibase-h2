# liquibase-h2
Demonstration for liquibase

### Execution

``` bash
# mvn spring-boot:run is ok as well
$ mvn

# show update sql
$ cd src/main/resources
$ liquibase  --driver=org.h2.Driver \
        --classpath=h2.jar \
        --changeLogFile=db/changelog-dev.yaml \
        --url="jdbc:h2:~/liquibase-demo;DB_CLOSE_ON_EXIT=FALSE" \
        --username=admin \
        --password=admin \
        updateSQL
        
# show rollback sql
$ src/main/resources
$ liquibase  --driver=org.h2.Driver \
        --classpath=h2.jar \
        --changeLogFile=db/changelog-dev.yaml \
        --url="jdbc:h2:~/liquibase-demo;DB_CLOSE_ON_EXIT=FALSE" \
        --username=admin \
        --password=admin \
        rollbackCountSQL 2
        
# tag database
$ src/main/resources
$ liquibase  --driver=org.h2.Driver \
        --classpath=h2.jar \
        --changeLogFile=db/changelog-dev.yaml \
        --url="jdbc:h2:~/liquibase-demo;DB_CLOSE_ON_EXIT=FALSE" \
        --username=admin \
        --password=admin \
        tag v1.0
        
# rollback by tag
$ src/main/resources
$ liquibase  --driver=org.h2.Driver \
          --classpath=h2.jar \
          --changeLogFile=db/changelog-dev.yaml \
          --url="jdbc:h2:~/liquibase-demo;DB_CLOSE_ON_EXIT=FALSE" \
          --username=admin \
          --password=admin \
          rollbackSQL v1.0
```
#### Then access http://localhost:8080/h2 to verify the result.
