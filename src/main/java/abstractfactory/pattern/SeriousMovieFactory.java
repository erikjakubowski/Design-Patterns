package abstractfactory.pattern;

public class SeriousMovieFactory implements IMovieFactory {

    @Override
    public IWesternMovie GetWesternMovie() {
        return new WesternSeriousMovie();
    }

    @Override
    public ISciFiMovie getSciFiMovie() {
        return new SciFiSeriousMovie();
    }
}
