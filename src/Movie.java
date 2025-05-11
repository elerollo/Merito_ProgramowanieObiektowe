public class Movie {
    private String title;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String title, String genre, double rating, int duration) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRecommended() {
        if (rating > 7.0) {
            return true;
        } else {
            return false;
        }
    }
}
