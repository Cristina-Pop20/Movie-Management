# Use a base image with Alpine Linux
FROM alpine:latest

# Install OpenJDK 17 manually
RUN apk --no-cache add openjdk17

WORKDIR /movie-management

COPY target/movie-management-0.0.1-SNAPSHOT.jar /movie-management/movie-management.jar

EXPOSE 8080

CMD ["java", "-jar", "movie-management.jar"]
