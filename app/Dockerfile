# Stage 1: Build stage
FROM gradle:8.2.1-jdk17 AS build
WORKDIR /home/gradle/src

# Copy everything from the root
COPY --chown=gradle:gradle . .

# Grant permission to the gradlew file in the root
RUN chmod +x gradlew

# Build the specific 'app' module
RUN ./gradlew :app:bootJar --no-daemon

# Stage 2: Runtime stage
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the JAR from the app module's build folder
COPY --from=build /home/gradle/src/app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]