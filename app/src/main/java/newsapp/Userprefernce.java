package newsapp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Userprefernce {
    private String name;
   private String query;
    private String language;
    private String sortBy;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getSortBy() {
        return sortBy;
    }
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
   
   @Override
public String toString() {
    return "UserPreference [name=" + name +
           ", query=" + query +
           ", language=" + language +
           ", sortBy=" + sortBy + "]";
}

}
