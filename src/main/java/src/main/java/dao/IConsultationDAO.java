package src.main.java.dao;

import java.util.List;
import java.util.Optional;

public interface IConsultationDAO {

    Optional<Consultation> get(long id);

    List<Consultation> getAll();

    void save(Consultation consultation);

    void update(Consultation consultation, String[] params);

    void delete(Consultation consultation);

}
