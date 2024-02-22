public class Movie {

    //Attributes
    private String titel;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private double lengthMinute;
    private String genre;

    //Constructor (initialize object)
    public Movie(String titel, String director, int yearCreated, boolean isInColor, double lengthMinute, String genre) {
        this.titel = titel;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthMinute = lengthMinute;
        this.genre = genre;
    }


    //Get Metoder
    public String getTitel() {
        return titel;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    // Det er ikke defineret at isInColor er true hvis input fra bruger er enten 'ja' eller 'nej', hvordan?
    public boolean getIsInColor() {
        return isInColor;
    }

    public double getLengthMinute() {
        return lengthMinute;
    }


    public String getGenre() {
      return genre;
    }
}

