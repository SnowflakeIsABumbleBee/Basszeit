FROM gradle:jdk21-jammy AS build
ARG DB_PASSWORD
ENV DB_PASSWORD=$DB_PASSWORD
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM eclipse-temurin:21-jdk-jammy
COPY --from=build /home/gradle/src/build/libs/Basszeit-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
