import java.util.Objects;

public class Controller {

    //Attribute
    MovieCollection collectionController;

    //Constructor
    public Controller(){

    }

    //Method
    public void addMovie(String titel, String director, int yearCreated, boolean isInColor, double lengthMinute, String genre) {
        collectionController.addMovie(new Movie(titel, director, yearCreated, isInColor, lengthMinute, genre));
    }

//}
//public String searchMovieAsString(String searchTitle) {
//    MovieCollection movies = movieCollection.searchMovie(searchTitle);
//    if(Objects.isNull(movies)) {
//        return "No match for \"" + searchTitle + "\".";
//    }
//    else {
//        return "---Movies containing \"" + searchTitle + "\" in title---\n" + movies + "\n---Search result ends---";
//    }
//}
//public String getMovieCollectionAsString() {
//    return "---MovieCollection begins---\n" + movieCollection + "\n---MovieCollection ends---";
//}
    //Information expert her
    //"Besked central"
}
