package abstractfactory.pattern;

public class SciFiSeriousMovie implements ISciFiMovie{

    @Override
    public String movieName() {
        return "This is a serious scifi movie = The Matrix";
    }
}
