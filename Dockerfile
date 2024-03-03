FROM openjdk:21
COPY target/movie-management-0.0.1-SNAPSHOT.jar movie-management-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/movie-management-0.0.1-SNAPSHOT.jar"]