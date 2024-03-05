FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY ./classes/artifacts/MicroservicesComments_jar/MicroservicesComments.jar /app

EXPOSE 8080

CMD ["java", "-jar", "MicroservicesComments.jar"]