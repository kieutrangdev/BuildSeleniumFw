package utils;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertiesFile {
    private ReadPropertiesFile() {
    }

    private static Properties properties = new Properties();
    private static final Map<String, String> CONFIGMAP = new HashMap<>();

    static {
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config/config.properties");
            properties.load(fis);

            for(Map.Entry<Object, Object> entry : properties.entrySet()) {
                CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()) );
            }
          //  properties.entrySet().forEach(entry -> CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String get(String key) throws Exception {
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))){
            throw new Exception("Property name " + key + " not found");

        }
        return CONFIGMAP.get(key);
    }

    public static String getValue(String key) throws Exception {
        if (Objects.isNull(properties.getProperty(key)) || Objects.isNull(key)) {
            throw new Exception("Property name " + key + " not found");
        }
        return properties.getProperty(key);
    }
}

