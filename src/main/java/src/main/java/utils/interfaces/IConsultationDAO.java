package src.main.java.utils.interfaces;

import src.main.java.model.Consultation;

import java.util.List;
import java.util.Optional;

public interface IConsultationDAO extends IBaseDAO<Consultation> {

    Optional<Consultation> get(long id);

    List<Consultation> getAll();

    void save(Consultation consultation);

    void update(Consultation consultation, String[] params);

    void delete(Consultation consultation);

}
