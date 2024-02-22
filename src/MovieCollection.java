import java.util.ArrayList;

public class MovieCollection {

   //Array til filmobjekter
   private final ArrayList<Movie> collection;

   //attributes
   int count = 0;

   //Constructor
    public MovieCollection() {
       collection = new ArrayList<Movie>();
   }

  //Methods
    public void addMovie (Movie m) {
            collection.add(m);
    }

}

