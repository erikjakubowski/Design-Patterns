package bridge.pattern;

public class Blue implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println(String.format("Blue borer with a width of %s inches", border));
    }
}
