package src.main.java.utility;

import java.io.InputStream;

public interface Resources {
    public static final String basePath = "src/main/resources/";
    public static final String xmlPath = basePath + "xml/";
    public static final String xsdPath = basePath + "xsd/";
    public static final String jsonPath = basePath + "json/";

    static InputStream getResourceAsStream(String myBatisConfigFileName) {
        return null;
    }
}
