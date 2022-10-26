package src.main.java.utility.interfaces;

import org.xml.sax.helpers.DefaultHandler;

public interface IparseSaxPojo {

    <T extends DefaultHandler> T parse(String path, T handler);

    boolean validate(String pathSchema, String pathXml);
}
