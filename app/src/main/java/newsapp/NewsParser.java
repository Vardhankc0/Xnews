package newsapp;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class NewsParser {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static List<NewsArticle> parse(String json) throws IOException{
        NewsApiResponse response=objectMapper.readValue(json, NewsApiResponse.class);
   
        return response.getArticles();
    }
}
