FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/movie-0.0.1-SNAPSHOT.jar movie-0.0.1-SNAPSHOT.jar

EXPOSE 7000

CMD ["java", "-jar", "movie-0.0.1-SNAPSHOT.jar"]