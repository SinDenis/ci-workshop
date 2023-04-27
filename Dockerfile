FROM openjdk:17-slim
COPY core/target/report.jar /app.jar
CMD java -jar /app.jar
