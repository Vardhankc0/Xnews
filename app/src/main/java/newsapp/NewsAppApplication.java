package newsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsAppApplication {
    public static void main(String[] args) {
        // This line starts the embedded Tomcat server on port 8080
        SpringApplication.run(NewsAppApplication.class, args);
    }
}