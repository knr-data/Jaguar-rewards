## API's 

The following list of API's are exposed by the application. Sample API invocations are available as part of the test/resources/arc.json

1. Create Enrollee 
   
   * Context Path : /enrollee
   
   * Http Method  : Post
    
2. Get Enrollee

    * Context Path : /enrollee/{id}

    * Http Method  : Get

3. Delete Enrollee

    * Context Path : /enrollee/{id}

    * Http Method  : Post
    
4. Update Enrollee

    * Context Path : /enrollee/{id}

    * Http Method  : Post
    
5. Create Dependant

    * Context Path : /enrollee/{id}/dependants

    * Http Method  : Post
    
6. Delete All Dependants

    * Context Path : /enrollee/{id}/

    * Http Method  : Delete
    
7. Delete a Dependant

    * Context Path : /enrollee/{id}/dependants/{dependantId}

    * Http Method  : Delete
    
8. Update a Dependant

    * Context Path : /enrollee/{id}/dependants/{dependantId}

    * Http Method  : Post



## How to Run the Service

* Close the service and do a mvn clean install
* Run using the command mvn spring-boot:run
* The app listens on the port 8080 and root path is "/"

## Swagger API Documentation

* Open API Specification document for the service can be accessed at http://localhost:8080/v3/api-docs/



    

