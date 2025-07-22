package Constants;

public class FrameworkConstant {
    private FrameworkConstant() {}
    private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/main/resources";
    private static final String CONFIGPATH = RESOURCEPATH + "/config/config.properties";

    public static String getConfigPath() {
        return CONFIGPATH;
    }
}
