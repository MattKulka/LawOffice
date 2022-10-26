package src.main.java.mappers;

import src.main.java.dao.models.Attorney;

import java.util.List;

public interface AttorneyMapper {
    Attorney selectAttorney( int id);
    List<String> selectAttorneyByName(String name);
}
