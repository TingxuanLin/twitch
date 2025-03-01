FROM gradle:8.4-jdk17 AS backend-build
WORKDIR /app

COPY ./twitchbe .  

RUN gradle clean build -x test

FROM openjdk:17-jdk-slim
WORKDIR /app

COPY --from=backend-build /app/build/libs/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
