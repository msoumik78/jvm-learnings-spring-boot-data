# Functionality (Spring-boot with Spring data jpa)
This repo contains a sample spring-boot CRUD app which is written using spring data jpa where we don't need to
write the queries and also the JDBC statements/prepared statements or resultsets. Spring data jpa encapsulates them all.


# Technical details and Pre-requisites
- Written using Spring Boot framework and comprising multiple modules
- Also leveraged Spring data jpa
- Also leveraged an in memory H2 database shipped with Spring boot



# How to run locally
- Clone this branch (branch-1a) to your laptop
- Ensure that you have JDK21/ JDK22 and Maven3.X available
- Build the project using the command :
  (`mvn clean package -DskipTests`)
- Now navigate to the folder bank-customers-core-main and run the app using the below command :
  (`java  -jar target/bank-customers-core-main-1.0-SNAPSHOT.jar`)
- Now we can open another terminal and populate some data as follows:
  (`curl -H "Content-Type: application/json" -X POST  -d '{"name": "name2","city": "city2","age": "42", "state": "state2", "profession": "prof2"}'  http://localhost:8080/api/1/bank-customers`)
- Now we can try to retrieve some data as follows:
  (`curl -H "Content-Type: application/json"  http://localhost:8080/api/1/bank-customers/name1`)
