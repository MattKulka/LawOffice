package src.main.java.core;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import src.main.java.utility.interfaces.IparseSaxPojo;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class Parser implements IparseSaxPojo {
    static Logger log = LogManager.getLogger(Parser.class.getName());


    @Override
    public <T extends DefaultHandler> T parse(String path, T handler) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = null;
        try {
            saxParser = factory.newSAXParser();
        } catch (ParserConfigurationException e) {
            log.log(Level.FATAL, e.getMessage(), e);

        } catch (SAXException e) {
            log.log(Level.FATAL, e.getMessage(), e);
        }
        try {
            saxParser.parse(path, handler);
        } catch (SAXException e) {
            log.log(Level.FATAL, e.getMessage(), e);

        } catch (IOException e) {
            log.log(Level.FATAL, e.getMessage(), e);
        }
        return handler;
    }

    @Override
    public boolean validate(String pathXsd, String pathXml) {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        Schema schema;
        SchemaFactory schemaFactory = SchemaFactory.newInstance(language);
        try {
            schema = schemaFactory.newSchema(new File(pathXsd));
        } catch (SAXException e) {
            log.log(Level.FATAL, e.getMessage(), e);
            throw new RuntimeException(e);
        }
        Validator validator = schema.newValidator();
        SAXSource source = new SAXSource(new InputSource(pathXml));
        try {
            validator.validate(source);
            return true;
        } catch (SAXException e) {
            Logger log = LogManager.getLogger(Parser.class.getName());
            log.log(Level.FATAL, "The document failed validation");
            log.log(Level.FATAL, e.getMessage(), e);
            return false;
        } catch (IOException e) {
            return false;
        }
    }
}