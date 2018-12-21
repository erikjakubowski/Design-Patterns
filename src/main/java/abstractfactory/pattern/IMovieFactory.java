package abstractfactory.pattern;

public interface IMovieFactory {
    IWesternMovie GetWesternMovie();
    ISciFiMovie getSciFiMovie();
}
