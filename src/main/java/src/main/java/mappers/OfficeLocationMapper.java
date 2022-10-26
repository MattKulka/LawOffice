package src.main.java.mappers;

import src.main.java.dao.models.OfficeLocations;

public interface OfficeLocationMapper {
    OfficeLocations selectOfficeLocation(int id);
}
