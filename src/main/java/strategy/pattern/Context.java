package strategy.pattern;

public class Context {
    IChoice myC;

    public void SetChoice(IChoice ic) {
        myC = ic;
    }

    public void ShowChoice(String st1, String st2) {
        myC.myChoice(st1, st2);
    }
}
