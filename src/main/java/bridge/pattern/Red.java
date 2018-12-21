package bridge.pattern;

public class Red implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println(String.format("Red borer outline with a %s inch border width", border ));
    }
}
