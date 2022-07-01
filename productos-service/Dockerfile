FROM maven:3.8.5-jdk-11 as builder
WORKDIR /workspace/app
COPY . .
RUN ["mvn", "clean", "package", "-DskipTests"]

FROM amazoncorretto:8
COPY --from=builder /workspace/app/productos-web/target/productos-web-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]