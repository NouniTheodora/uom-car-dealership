# Use a base image with JDK for Spring Boot
FROM openjdk:17-jdk-slim

# Set environment variables for the application
ENV SPRING_PROFILES_ACTIVE=docker

# Copy the application JAR to the container
COPY target/cars.jar app.jar

# Expose the port that the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]