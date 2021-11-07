# Securing the Rest API over JWT using SpringBoot and Keycloak
### This App written in Java, SpringBoot using Maven for the build, that showcases a API Endpoint Authentication.

This App demonstrates:

How Rest API can be secured using Keycloak generated JWT

#### use below command to run the application 

 mvn spring-boot:run

#### use below commands on the project directory to run the prebuilt keycloak and DB needed for the whole setup

 docker-compose up --build 

#### use below curl command to get the access token (Can use the Postman) from the response

curl -i -X POST \
   -H "Content-Type:application/x-www-form-urlencoded" \
   -d "client_id=login-app" \
   -d "username=csjp" \
   -d "password=csjp" \
   -d "grant_type=password" \
   -d "client_secret=8f1e613a-4666-41ed-bd81-22011932c640" \
 'http://localhost:8080/auth/realms/Users/protocol/openid-connect/token'
 
#### Test the API using below command (removing the braces after replacing with actual token)

curl -i -X GET \
   -H "Authorization:Bearer {access_token}" \
 'http://localhost:8081/api/v1/hello'

Note: JAVA_HOME must be set to JDK instead of JRE
