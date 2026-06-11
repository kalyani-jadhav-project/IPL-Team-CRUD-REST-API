# IPL Team Management System

A Spring Boot REST API project for managing IPL teams using MySQL Database. This project demonstrates CRUD (Create, Read, Update, Delete) operations using Spring Boot, Spring Data JPA, MySQL, and Postman.

## Features

* Add a new IPL Team
* View all IPL Teams
* View Team by ID
* Update Team details
* Delete Team
* MySQL Database Integration
* REST API Testing using Postman

## Technologies Used

* Java 21
* Spring Boot 4
* Spring Data JPA
* MySQL
* Maven
* Postman

## Project Structure

```text
com.IPL.ipl_team
│
├── Team.java
├── TeamDao.java
├── TeamService.java
├── TeamController.java
└── IplTeamApplication.java
```

## Database Configuration

application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ipl_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Create Database

```sql
CREATE DATABASE ipl_db;
```

## REST API Endpoints

### Save Team

```http
POST /save
```

Sample Request Body

```json
{
  "id": 1,
  "teamName": "Mumbai Indians",
  "captain": "Hardik Pandya",
  "trophies": 5
}
```

### Get All Teams

```http
GET /getall
```

### Get Team By ID

```http
GET /get/{id}
```

### Update Team

```http
PUT /update
```

Sample Request Body

```json
{
  "id": 1,
  "teamName": "Mumbai Indians",
  "captain": "Rohit Sharma",
  "trophies": 6
}
```

### Delete Team

```http
DELETE /delete/{id}
```

## Output

The application stores IPL Team information in MySQL and performs CRUD operations through REST APIs.

## Author

A. Kalyani Jadhav
