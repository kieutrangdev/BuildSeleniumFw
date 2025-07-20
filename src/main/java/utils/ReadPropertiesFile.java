package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertiesFile {
    private ReadPropertiesFile() {
    }

    public static String getValue(String key) throws Exception {
        String value = "";
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config/config.properties");
        prop.load(fis);
        value = prop.getProperty(key);
        if(Objects.isNull(value)) {
            throw new Exception("Property name " + key + " not found");
        }
        return value;
    }
}

