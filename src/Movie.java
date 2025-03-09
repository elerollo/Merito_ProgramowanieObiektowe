public class Movie {
    private String title;
    private String genre;
    private double rating;

    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public boolean isRecommended() {
        if (rating > 7.0) {
            return true;
        } else {
            return false;
        }
    }
}
