public class MovieCollection {

   //Array objekt
   private final Movie[] collection;

   //attributes
   int count = 0;

   //Constructor
    public MovieCollection(int size) {
       collection = new Movie[size];
       count++;
   }

  //Methods
    public void addMovie (String titel, String director, int yearCreated, boolean isInColor, double lengthMinute, String genre) {
        if (count > collection.length) {
            collection[count++] = new Movie(titel,director, yearCreated, isInColor, lengthMinute, genre);
            System.out.println("Film tilføjet");
        } else {
            System.out.println("Fejl i tilføjelse. Bibilioteket er fyldt");
        }
    }

}

