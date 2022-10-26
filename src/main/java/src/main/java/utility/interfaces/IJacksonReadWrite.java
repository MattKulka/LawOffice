package src.main.java.utility.interfaces;

public interface IJacksonReadWrite {
    String unmarshal(Object object);

    <T> T marshall(String path, Class<?> T);
}

