package src.main.java.utility;

public interface IJacksonReadWrite {
    String unmarshal(Object object);

    <T> T marshall(String path, Class<?> T);
}

