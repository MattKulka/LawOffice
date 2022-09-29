package src.main.java.interfaces;

public interface IBaseDAO <T> {

    T getByID(long id);

    void remove(long id);

    void create(T object);

    void update(T object);

}
