import java.util.ArrayList;
import java.util.Random;

class Movie {
    private static final ArrayList<String> movie = new ArrayList<String>();

    static {
        movie.add("A New Hope");
        movie.add("Revenge of the Sith");
        // movie.add("The Empire Strikes Back");
        // movie.add("Attack of the Clones");
        // movie.add("Return of the Jedi");
        // movie.add("The Phantom Menace");
    }

    public static String generateRandomMovie() {
        Random rand = new Random();
        return movie.get(rand.nextInt(movie.size()));
    }
}