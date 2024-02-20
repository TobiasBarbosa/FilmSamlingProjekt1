import java.util.Scanner;

public class MainFilmSamling {

    public static void main(String[] args) {

    Scanner scannerInput = new Scanner(System.in);


        System.out.println("Indtast filmens titel");
        String titel = scannerInput.nextLine();
        System.out.println("");

        System.out.println("Indtast filmens director");
        String director = scannerInput.nextLine();
        System.out.println("");

        System.out.println("Indtast året filmen er lavet");
        int yearCreated = scannerInput.nextInt();
        System.out.println("");

        System.out.println("Er filmen i farve? (Svar 'ja' eller 'nej'");
        boolean isInColor = scannerInput.nextBoolean();
        System.out.println("");

        System.out.println("Indtast filmens længde (antal timer, minutter)");
        double lengthMinute = scannerInput.nextDouble();
        System.out.println("");

        System.out.println("Indtast filmens genre");
        String genre = scannerInput.nextLine();
        System.out.println("");




//    //Objekt
//        // String titel, String director, int yearCreated, boolean isInColor, double lengthMinute, String genre
//    //Movie Movie1 = new Movie("Batman ", "Tarantino", 1993, true, 01.33, "Hero");
//    Movie Movie2 = new Movie(scannerInput.nextLine(), scannerInput.nextLine(),scannerInput.nextInt(),scannerInput.nextBoolean(),scannerInput.nextDouble(),scannerInput.nextLine());
//
//    //MovieCollection Movie3 = new MovieCollection();
//

    }
}
