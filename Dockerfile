FROM eclipse-temurin:17

COPY target/*.jar app.jar

EXPOSE 5000

ENTRYPOINT ["java", "-jar", "/app.jar"]