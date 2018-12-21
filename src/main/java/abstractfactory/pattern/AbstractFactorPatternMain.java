package abstractfactory.pattern;

public class AbstractFactorPatternMain {
    public static void main(String[] args){

        System.out.println("****Abstract Factory Pattern*****");

        ComedyMovieFactory comedyMovieFactory = new ComedyMovieFactory();
        ISciFiMovie iSciFiMovie = comedyMovieFactory.getSciFiMovie();
        IWesternMovie iWesternMovie = comedyMovieFactory.GetWesternMovie();

        System.out.println("\nComedy versions: ");
        System.out.println(iSciFiMovie.movieName());
        System.out.println(iWesternMovie.movieName());


        SeriousMovieFactory seriousMovieFactory = new SeriousMovieFactory();
        ISciFiMovie iSciFiMovie1 = seriousMovieFactory.getSciFiMovie();
        IWesternMovie iWesternMovie1 = seriousMovieFactory.GetWesternMovie();

        System.out.println("\nSerious versions: ");
        System.out.println(iSciFiMovie1.movieName());
        System.out.println(iWesternMovie1.movieName());




    }
}
