package singleton.pattern;

public class ProductionVersion {

    private static ProductionVersion _prodVersion;

    private ProductionVersion(){}

    public static ProductionVersion get_prodVersion() {

        if (_prodVersion == null){
            _prodVersion = new ProductionVersion();
            System.out.println("Software has shipped from Dev and is now in Production");
        }else {
            System.out.println("Production Software is already deployed. Reference Docs for versioning deployment strategy");
        }

        return _prodVersion;
    }
}
