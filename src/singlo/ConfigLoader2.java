package singlo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader2 {


    private Properties properties;
    private static ConfigLoader2 configLoader2;
    public static int nbInstance = 0;

    private ConfigLoader2() {
        properties = new Properties();

        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.err.println("Fichier config.properties introuvable dans le classpath");
                return;
            }
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperties(String key) {
        return properties.getProperty(key);
    }

    public static ConfigLoader2 getInstance(){
        if (configLoader2 == null) {
            configLoader2 = new ConfigLoader2();
            nbInstance ++;
        }


        return configLoader2;
    }
}
