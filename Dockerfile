FROM openjdk:17-slim
COPY core/target/*.jar /app.jar
CMD java -jar /app.jar
