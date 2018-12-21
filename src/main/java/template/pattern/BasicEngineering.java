package template.pattern;

public abstract class BasicEngineering {
    public void Papers(){
        Math();
        Theory();
        SpecializedPaper();
    }
    private void Math(){
        System.out.println("principia mathematica");
    }
    private void Theory(){
        System.out.println("Critique of Pure Reason");
    }
    public abstract void SpecializedPaper();
}
