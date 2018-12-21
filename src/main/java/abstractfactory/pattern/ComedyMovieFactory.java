package abstractfactory.pattern;

public class ComedyMovieFactory implements IMovieFactory {

    @Override
    public IWesternMovie GetWesternMovie() {
        return new WesternComedyClass();
    }

    @Override
    public ISciFiMovie getSciFiMovie() {
        return new SciFiComedyMovie();
    }

}
