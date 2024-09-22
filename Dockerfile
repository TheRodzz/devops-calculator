FROM openjdk:17-jdk-slim

COPY ./target/Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./

WORKDIR ./

CMD ["java", "-cp", "Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "org.example.Main"]
