import java.util.LinkedList;
import java.util.List;

public class Cinema {
    private List<Movie> listOfMovies = new LinkedList<>();

    public void addMovie(Movie movie) {
        listOfMovies.add(movie);
        System.out.println("You have added a movie to the cinema.");
    }
    
    public Movie findLongestMovie() {
        int longestMovie = 0;
        Movie longestMovieName = null;
        for (Movie movie : listOfMovies) {
            if (movie.getDuration() > longestMovie) {
                longestMovie = movie.getDuration();
                longestMovieName = movie;
            }
        }
        System.out.println("The longest movie is: " + longestMovieName.getTitle());
        return longestMovieName;
    }
}
