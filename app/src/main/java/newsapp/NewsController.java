package newsapp;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Crucial: Allows the HTML to talk to Java
public class NewsController {

    private final NewsApiClient apiClient = new NewsApiClient();

    @GetMapping("/news")
    public List<NewsArticle> fetchNews(@RequestParam(required = false, defaultValue = "world") String query) {
        try {
            // This calls your existing method in NewsApiClient.java
            return apiClient.fetchNewsArticles(query, "en", "publishedAt");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}