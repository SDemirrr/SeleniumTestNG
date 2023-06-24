package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static {//Her method'dan once calisir(static blok)
        String dosyaYolu="configuration.properties";//properties clasinn dosya yolunu aldik
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fis);//fis'in okudugu bilgileri properties'e yukledi.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){
        /*
        test method'undan yolladigimiz String key degerini alip
        Properties class'indan getProperty(); method'unu kullanarak
        bu key'e ait value'yi bze getirir.
         */
        return properties.getProperty(key);
    }

}
