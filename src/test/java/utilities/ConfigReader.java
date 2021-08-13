package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        String path="configuration.properties";
        try {
            FileInputStream fileInputStream= new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);

            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//methodumuzu oluşturalım, yolladığımız key e değer atayıp döndürecek
    public static String getProperty(String key){
        //bunun tek bir görevi var oda String dönderecek

        return properties.getProperty(key);

    }

}
