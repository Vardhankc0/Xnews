package newsapp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.sql.Time;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsArticle {
     private String title;
    private String description;
    private String author;
    private String url;
    private String publishedAt;
    private String content;
    private String urlToImage; // MUST match the JSON key exactly

    // Standard Getters and Setters
    public String getUrlToImage() { return urlToImage; }
    public void setUrlToImage(String urlToImage) { this.urlToImage = urlToImage; }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
   @Override
public String toString() {
    return "NewsArticle [author=" + author + ", title=" + title + 
           ", urlToImage=" + urlToImage + ", url=" + url + "]";
}

}
