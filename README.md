# Car dealership app
A is a car dealership app for UoM in Spring Boot.

## Installation

### Installing Dockers
This project can run in Docker containers.

Install Dockers in Windows following [this guide](https://medium.com/@supportfly/how-to-install-docker-on-windows-bead8c658a68).

### Installing Apache Maven

Install Apache Maven following [this guide](https://phoenixnap.com/kb/install-maven-windows).

Before starting the Docker containers, ensure that your Spring Boot application is compiled and packaged. 
Run the following Maven command in your project root directory to generate the JAR file:

`mvn clean package`

This command will create a target/cars.jar file.

#### Build the Docker Containers

`docker compose up --build`

#### Start/terminate the Docker Containers

`docker compose up
`

`docker compose down
`
### Database
Connect to the local database with your favourite database client:

**Server host:** localhost

**Port:** 3306

**Username:** root

_** Leave the password field empty_
