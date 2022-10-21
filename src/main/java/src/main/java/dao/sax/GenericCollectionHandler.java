package src.main.java.dao.sax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public abstract class GenericCollectionHandler<T> extends DefaultHandler {
    private Map<String, String> tempFields = new HashMap<>();
    private StringBuffer sBuffer = new StringBuffer();
    private String qNameCursor;
    private String typeName;

    protected List<T> results = new ArrayList<>();

    public GenericCollectionHandler(Class<T> type) {
        typeName = type.getSimpleName();
    }

    public abstract void processElement(Map<String, String> map);

    public List<T> getResults() {
        return results;
    }

    @Override
    public void characters(char[] chars, int beg, int len) throws SAXException {
        sBuffer.append(chars, beg, len);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        qNameCursor = qName;
        sBuffer = new StringBuffer();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equalsIgnoreCase(typeName)) {
            processElement(tempFields);
            tempFields.clear();
        } else {
            tempFields.put(qNameCursor, sBuffer.toString());
        }
    }

    @Override
    public void startDocument() throws SAXException {
        tempFields.clear();
        results.clear();
    }

    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        throw e;
    }

    @Override
    public void fatalError(SAXParseException spe) throws SAXException {
        throw new SAXException(spe.toString());
    }
}
