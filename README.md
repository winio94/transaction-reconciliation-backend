<h2>transaction reconciliation backend</h2>


-----------------------------------------------------------------------

<h4>Running tests</h4>

* To run unit tests, execute following maven command from project root
  directory : `mvn clean verify`

<h4>Building project</h4>

* To build project, execute following maven command from project root
  directory : `mvn clean install`
* To build project without running tests, execute following maven command from project root
  directory : `mvn clean install -DskipTests=true`

<h4>Running application</h4>
<h5>Maven</h5>

* To run application locally from generated sources using maven, execute following maven command
  from project root directory :
  `mvn spring-boot:run -Dspring-boot.run.profiles=dev`
    * REST API will be accessible on port 8080

<h5>Docker</h5>

To run application locally, execute following docker-compose command from project root
directory : `docker-compose up -d`

* REST API will be accessible on port 6868 (running as a container)

Checking logs

* Run `docker ps`
    * Find Container ID for running application `transaction-reconciliation-backend`
* Run `docker logs <CONTAINER_ID>`

-----------------------------------------------------------------------

<h3>Postman setup</h3>
All existing REST APIs can be executed through Postman REST API client

* Postman collection can be
  found [here](./infrastructure/postman/transaction_reconciliation.postman_collection.json)
* Postman environment for application built via maven command can be
  found [here](./infrastructure/postman/LOCAL.postman_environment.json)
* Postman environment for application built docker compose command can be
  found [here](./infrastructure/postman/LOCAL_DOCKER.postman_environment.json)

-----------------------------------------------------------------------

<h3>REST API documentation</h3>

* API contract can be opened via https://editor.swagger.io/#. File can be
  found [here](./infrastructure/contract/openapi.yaml)
* API documentation can also be accessed via web
  browser [here](http://localhost:8080/swagger-ui/index.html), provided application is up and
  running.

  -----------------------------------------------------------------------