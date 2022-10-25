package src.main.java.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;

public class JacksonReadWrite implements IJacksonReadWrite {
    static Logger log = LogManager.getLogger(JacksonReadWrite.class.getName());

    @Override
    public String unmarshal(Object object) {
        ObjectMapper om = new ObjectMapper();
        String json = null;
        try {
            json = om.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.log(Level.FATAL, "The object failed to unmarshal");
            log.log(Level.FATAL, e.getMessage(), e);
        }
        return json;
    }

    @Override
    public <T> T marshall(String path, Class<?> T) {
        ObjectMapper om = new ObjectMapper();

        try {
            return (T) om.readValue(new FileReader(path), T);
        } catch (IOException e) {
            log.log(Level.FATAL, e.getMessage(), e);
            return (T) T;
        }
    }
}