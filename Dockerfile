FROM openjdk:17-slim
COPY app.jar /app.jar
CMD java -jar /app.jar
