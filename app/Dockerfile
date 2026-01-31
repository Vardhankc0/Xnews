FROM gradle:8.2.1-jdk17 AS build
WORKDIR /home/gradle/src

# Copy all files from root to WORKDIR
COPY . .

# Ensure permissions and build the specific module
RUN chmod +x gradlew
RUN ./gradlew :app:bootJar --no-daemon

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Note the 'app' prefix in the path
COPY --from=build /home/gradle/src/app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]