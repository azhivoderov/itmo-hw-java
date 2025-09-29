FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY spring-core/pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests

FROM alpine/java:21-jdk
LABEL authors="Bizon"
WORKDIR /app
COPY --from=build /app/target/java2025-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "java2025-0.0.1-SNAPSHOT.jar"]
