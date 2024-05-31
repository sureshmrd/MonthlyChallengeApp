# Monthly Challenges List

## Introduction
The **Monthly Challenges List** is a web application designed to help users keep track of and manage their monthly challenges. Users can create, update, and view a list of challenges they want to accomplish each month.
This is just a basic application of using java spring and react , performing mainly **CRUD** operations.

## Features
- **Challenge Management**: Add, update, delete, and view monthly challenges.
- **Responsive Design**: User-friendly interface 


## Technologies Used
- **Backend**: Java, Spring Framework (Spring Boot, Spring jpa)
- **Frontend**: HTML, Bootstrap, JavaScript , React.js
- **Database**: h2 Database
- **Build Tool**: Maven

## Code Editor/IDE USed
> Intellij IDEA Community Edition

## Other Tools
- **Postman** - Creating and Sending Requests: Postman allows you to create HTTP requests with various methods (GET, POST, PUT, DELETE, etc.) and send them to your API endpoints.

## About h2 Database 
- H2 is a Java SQL database.
- Very fast, open source.
- Browser based Console application.
- <img width="533" alt="Screenshot_20240531_154010" src="https://github.com/sureshmrd/MonthlyChallengeApp/assets/123853377/0ab03cfb-b3fb-49b6-bd64-c1f5c2de44f8">

## Frontend sample 
- Created using basic React.js , implemented adding and viewing the challenges.
- The Application is End to End , the new challenges are added to the h2 database and retrived from the same.
- <img width="532" alt="image" src="https://github.com/sureshmrd/MonthlyChallengeApp/assets/123853377/b188a732-c562-44f9-8c11-816c2d7e42b0">

## Backend Details
- The whole Backend is done using java spring boot.
- The project structure is as follows:
- ![image](https://github.com/sureshmrd/MonthlyChallengeApp/assets/123853377/cdbbad6c-2c3e-4938-811f-b80a95a7fdc3)

> Backend server is running at port 8080 and react is running at port 3000 , the communication is done using CORS(cross origin resource sharing ) annotation by spring @CrossOrigin(origins="http://localhost:3000").


