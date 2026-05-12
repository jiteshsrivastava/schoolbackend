# Stage 1: Build using Maven and JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run using JRE 21 (Slimmer for faster hosting)
FROM eclipse-temurin:21-jre-jammy
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]