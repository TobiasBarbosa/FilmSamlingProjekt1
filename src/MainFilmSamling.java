import java.util.Collection;
import java.util.Scanner;

public class MainFilmSamling {

    public static void main(String[] args) {

        int SENTINEL = 4;
        int userChoice = 0;

    Scanner scannerInput = new Scanner(System.in);

    //Instances
    Controller controller = new Controller();
    MovieCollection collection = new MovieCollection();

        System.out.println("Velkommen til din Film Samling");

    while (userChoice != SENTINEL) {
        System.out.println("Indtast '1' for at tilføje en film");
        System.out.println("Indtast '2' for at søge");
        System.out.println("Indtast '3' for at se din filmsamling");
        System.out.println("Indtast '4' for at afslutte");
        userChoice = scannerInput.nextInt();

        if(userChoice == 1) {

            //1. Bruger input - Filmens detaljer
            scannerInput.nextLine();
            System.out.println("Indtast filmens titel");
            String titel = scannerInput.nextLine();
            System.out.println(titel);
            System.out.println("");

            System.out.println("Indtast filmens director");
            String director = scannerInput.nextLine();
            System.out.println("");

            System.out.println("Indtast året filmen er lavet");
            int yearCreated = scannerInput.nextInt();
            scannerInput.nextLine(); //Scanner bug solution
            System.out.println("");

            System.out.println("Er filmen i farve? (Svar 'ja' eller 'nej')");
            String color = scannerInput.next();
            boolean isInColor = color.equals("ja");
            // Lav det andet if statement for boolean color...
            System.out.println("");

            System.out.println("Indtast filmens længde (antal timer, minutter)");
            double lengthMinute = scannerInput.nextDouble();
            scannerInput.nextLine(); //Scanner bug solution
            System.out.println("");


            System.out.println("Indtast filmens genre");
            String genre = scannerInput.nextLine();

            Movie movieObject = new Movie (titel,director,yearCreated,isInColor,lengthMinute,genre);
            collection.addMovie(movieObject);
            //
            System.out.println("Filmen er nu tilføjet");
            System.out.println("Filmens informationer:");// Hvordan kan man printe alle info ud brugeren lige har indtastet i første loop?
            System.out.println("Titel: " + titel); //titel udskriver ikke, hvorfor?
            System.out.println("Director: " + director);
            System.out.println("Årstal: " + yearCreated);
            System.out.println("Film i farve: " + color);
            System.out.println("Længde: " + lengthMinute);
            System.out.println("Genre: " + genre);
            System.out.println("");


        } else if (userChoice == 2) {
            //2. Søge efter film
            System.out.println("Hvad søger du?");
            String search = scannerInput.next();
            String printMovieCollection = collection.searchMovie(search);
            System.out.println(printMovieCollection);

        } else if (userChoice == 3) {
            //3. Overblik over hele filmsamlingen
            System.out.println("Oversigt over din filmsamling");
            System.out.println(collection);



        }else if (userChoice == 4) {
            //4. Afbryder program
            System.out.println("Afslutter program");
        }
        else {
            System.out.println("du skal vælge enten valg 1 eller valg 2");
        }
    }


//NOTER
// Scanner bug - efter int variabler (oftest) brug denne kode: scanner.nextLine();


    }
}
