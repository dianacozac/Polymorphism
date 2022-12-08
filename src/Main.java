public class Main {
    public static void main(String[] args) {


        Movie theMovie = new Movie("Star wars");
        theMovie.watchMovie();

       Movie theMovie1 = new Adventure (" Star Wars ");
       theMovie1.watchMovie(30);

       Movie theMovie2 = new Comedy ( " shrek ");
       theMovie2.watchMovie();



      Movie theMovie3 = Movie.getMovie("Adventure", "Star Wars");
       theMovie3.watchMovie();

    }
}