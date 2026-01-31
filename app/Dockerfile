# -------- Stage 1: Build --------
FROM gradle:8.2.1-jdk17 AS build
WORKDIR /home/gradle/src

# Copy project files
COPY --chown=gradle:gradle . .

# Build the app module
RUN gradle :app:bootJar --no-daemon

# -------- Stage 2: Runtime --------
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy jar from build stage
COPY --from=build /home/gradle/src/app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
