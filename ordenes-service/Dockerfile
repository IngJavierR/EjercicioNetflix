FROM maven:3.8.5-jdk-11 as builder
WORKDIR /workspace/app
COPY . .
RUN ["mvn", "clean", "package"]

FROM amazoncorretto:8
COPY --from=builder /workspace/app/ordenes-web/target/ordenes-web-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "app.jar"]