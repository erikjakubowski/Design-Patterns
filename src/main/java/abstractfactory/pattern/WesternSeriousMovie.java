package abstractfactory.pattern;

public class WesternSeriousMovie implements IWesternMovie {
    @Override
    public String movieName() {
        return "This is a serious Western Movie = True Grit";
    }
}
