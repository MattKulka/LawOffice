package src.main.java.dao;

import java.util.List;
import java.util.Optional;

public interface IConsultationDAO {

    public interface IConsultationDao<T> {
        Optional<Consultation> get(long id);

        List<Consultation> getAll();

        void save(Consultation consultation);

        void update(Consultation consultation, String[] params);

        void delete(Consultation consultation);
    }

}
