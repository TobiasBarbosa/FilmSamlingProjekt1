import java.util.Scanner;

public class MainFilmSamling {

    public static void main(String[] args) {

        //Attributes

        int AFSLUT = 2;


    Scanner scannerInput = new Scanner(System.in);
        //Objekt
        Controller controller = new Controller();

        System.out.println("Velkommen til din Film Samling");

    while (true) {

        System.out.println("Indtast '1' for at tilføje en film");
        System.out.println("Indtast '2' for at afslutte");
        int valg = scannerInput.nextInt();

        if(valg == 1) {

            System.out.println("Indtast filmens titel");
            String titel = scannerInput.nextLine();
            scannerInput.nextLine(); //Scanner bug solution
            System.out.println("");

            System.out.println("Indtast filmens director");
            String director = scannerInput.nextLine();
            System.out.println("");

            System.out.println("Indtast året filmen er lavet");
            int yearCreated = scannerInput.nextInt();
            scannerInput.nextLine(); //Scanner bug solution
            System.out.println("");

            System.out.println("Er filmen i farve? (Svar 'ja' eller 'nej')");
            String color = scannerInput.nextLine();
            boolean isInColor = color.equals("ja");
            System.out.println("");

            System.out.println("Indtast filmens længde (antal timer, minutter)");
            double lengthMinute = scannerInput.nextDouble();
            scannerInput.nextLine(); //Scanner bug solution
            System.out.println("");

            System.out.println("Indtast filmens genre");
            String genre = scannerInput.nextLine();
            System.out.println("Filmen er nu tilføjet");
            System.out.println("");


        } else if (valg == 2) {
            System.out.println("Afslutter program");
            break;
        } else {
            System.out.println("du skal værlge enten valg 1 eller valg 2");
        }
    }



// Scanner bug - efter int variabler brug denne kode: scanner.nextLine();

//    //Objekt
//        // String titel, String director, int yearCreated, boolean isInColor, double lengthMinute, String genre
//    //Movie Movie1 = new Movie("Batman ", "Tarantino", 1993, true, 01.33, "Hero");
//    Movie Movie2 = new Movie(scannerInput.nextLine(), scannerInput.nextLine(),scannerInput.nextInt(),scannerInput.nextBoolean(),scannerInput.nextDouble(),scannerInput.nextLine());
//
//    //MovieCollection Movie3 = new MovieCollection();
//

    }
}
