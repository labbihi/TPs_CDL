package singlo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Old {
    private static ConfigLoader instance;
    private Properties properties;

    private Old() {
        // Lecture d'un fichier
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

    public static ConfigLoader getInstance() {
        if (instance == null) {
            instance = new ConfigLoader();
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}