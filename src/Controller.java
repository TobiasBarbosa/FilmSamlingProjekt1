public class Controller {

    //Attribute
    MovieCollection collection;

    //Constructor
    public Controller(){

    }

    //Method
    public void addMovie(String titel, String director, int yearCreated, boolean isInColor, double lengthMinute, String genre) {
        collection.addMovie(new Movie(titel, director, yearCreated, isInColor, lengthMinute, genre));
    }
}
