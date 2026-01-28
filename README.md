# REST-APIs-of-Spring-Boot


Spring Boot REST API Project Structure:  

REST_API_TEMPLATE/  
│  
├─ src/  
│   ├─ main/  
│   │   ├─ java/com/RESTAPI/REST_Template/  
│   │   │   ├─ Controller/  
│   │   │   ├─ DTO/  
│   │   │   ├─ Model/  
│   │   │   ├─ Repository/  
│   │   │   └─ Service/  
│   │   └─ resources/   
│   │       ├─ application.properties  
│   │       └─ static/  (if any)  
│   │  
│   └─ test/   
│  
├─ .gitignore  
├─ pom.xml  
├─ README.md  
└─ LICENSE  
  
# Backend project title:
A Spring Boot REST API template project with MySQL integration, validation, and Swagger UI for API documentation.

## Features  
- Spring Boot 3.5.9  
- REST API endpoints with CRUD operations  
- MySQL database support with JPA/Hibernate  
- Input validation using Jakarta Validation   
- Swagger UI integration  
- Proper layered architecture (Controller, Service, Model, DTO, Exception, Repository)  

  Troubleshooting (2026-01-28)  
 
# Issue: Spring Boot was connecting to H2 instead of MySQL, so tables weren’t created.    
## Troubleshooting (2026-01-28)  
Cause:  
MySQL configuration not picked up correctly.  
Maven commands were previously run from the wrong directory.  
Fix:  
Ensure pom.xml is in the project root:  
Example: F:\SpringBoot-API-Template\API\REST_API_TEMPLATE  

## Clean and rebuild:
mvn clean  
mvn install  
mvn spring-boot:run  
(On the command line you have to do it)  

Confirm application.properties points to MySQL:  
Check logs: MySQL connection should appear instead of H2  

Outcome:
MySQL is now connected and tables are auto-created.
