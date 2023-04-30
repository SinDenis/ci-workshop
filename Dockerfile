FROM openjdk:17-slim
COPY target/jpa-workshop-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT exec java -jar /app.jar
