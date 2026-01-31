package newsapp;

import java.io.IOException;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NewsApiClient {

    private static final String API_URL = "https://newsapi.org/v2/everything";
    private static final String API_KEY = "c1387fcaa0464ca0a6e6e814212e53a8";
    private static final OkHttpClient client = new OkHttpClient();

    public NewsApiClient() {
    }

    public List<NewsArticle> fetchNewsArticles(
            String query, String language, String sortBy) throws IOException {

        String url = buildUrl(query, language, sortBy);

        Request request = new Request.Builder()
                .url(url)
                .addHeader("X-Api-Key", API_KEY)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("unexpected response code: " + response.code());
            }

            String jsonResponse = response.body().string();
            return NewsParser.parse(jsonResponse);
        }
    }

    private String buildUrl(String query, String language, String sortBy) {

        if (query == null || query.trim().isEmpty()) {
            throw new IllegalArgumentException("Query parameter must not be empty");
        }

        StringBuilder url = new StringBuilder(API_URL);
        url.append("?q=").append(query);
        url.append("&apiKey=").append(API_KEY);

        if (language != null && !language.trim().isEmpty()) {
            url.append("&language=").append(language);
        }

        if (sortBy != null && !sortBy.trim().isEmpty()) {
            url.append("&sortBy=").append(sortBy);
        }

        return url.toString();
    }
}
