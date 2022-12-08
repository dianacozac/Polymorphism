public class Movie {

    private String title;
// consturctor
    public Movie(String title) {
        this.title = title;
    }
// metoda

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println ( title + " is a " + instanceType + "film ");
    }
    public void watchMovie( int offset) {
        System.out.println( "the movie is about to start in " + offset + "minutes" );
        watchMovie();
    }


    public static Movie getMovie (String type, String title) {

         switch ( type.toUpperCase().charAt(0) ) {
             case 'A' : return new Adventure( title );
             case 'C' : return new Comedy( title );
             default : return new Movie( title );

        }
      }
    }
 class Adventure extends Movie {
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
//        super.watchMovie();
        System.out.printf( ".. %s%n ".repeat(3) ,
                "Pleasant scene" ,
                "Scary Movie",
                "Something bad happens");
    }
}
 class Comedy extends Movie {
    public Comedy (String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf( ".. %s%n ".repeat(3) ,
                "funny" ,
                "happy ending",
                "nice music");
    }
}
