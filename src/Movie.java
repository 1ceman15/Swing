import java.io.Serializable;

public class Movie implements Serializable {
    private String title;
    private  boolean isWatched;
    private int rating;
    Movie(String title, boolean isWatched, int rating){
        this.title = title;
        this.isWatched = isWatched;
        this.rating = rating;
    }
    public boolean watched(){
        return isWatched;
    }
    public String getTitle(){
        return title;
    }
    public int getRating(){
        return rating;
    }

}
