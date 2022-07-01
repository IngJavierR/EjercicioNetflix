FROM maven:3.8.5-jdk-11 as builder
WORKDIR /workspace/app
COPY . .
RUN ["mvn", "clean", "package"]

FROM amazoncorretto:11
COPY --from=builder /workspace/app/target/Zuul-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]