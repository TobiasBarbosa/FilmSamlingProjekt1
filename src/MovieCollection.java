import java.util.ArrayList;

public class MovieCollection {

    //Array til filmobjekter
    private final ArrayList<Movie> movieList = new ArrayList<>();

    //Methods
    public void addMovie(Movie plusMovie) {
        movieList.add(plusMovie);
    }

    //Search metode
    public String searchMovie(String searchTitle) {
        String result = "";
        for (Movie movie : movieList) {
            if (movie.getTitel().toLowerCase().contains(searchTitle.toLowerCase())) {
                System.out.println(result);
                result += movie.toString();
            } else {
               return "Du har ingen film med denne titel";
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = " ";
        for(Movie movie : movieList) {
            result += movie;
        }
        return result;
    }
}

//for each loop ind laver et objekt af movie klassen inde i loop og iterer over arrayliste...
    //Object method
//    @Override
//    public String toString(){
//        String result = "";
//        for (Movie movie : movieList) {
//        return = Movie;
//        }
//        return result.toString();
//    }

//    public searchMovie () {
//     }

    //Movie objekt her
    //creator of movie
    //Information expert ift til egen liste
    //Liste med movies


