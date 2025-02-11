# Build stage
FROM gradle:jdk21 AS build
WORKDIR /app
COPY . .
# Concede permissões de execução para o arquivo gradlew
RUN chmod +x ./gradlew
RUN ./gradlew build

# Execution stage
FROM eclipse-temurin:21-jdk AS runner
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
