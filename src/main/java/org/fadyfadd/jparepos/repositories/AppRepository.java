package org.fadyfadd.jparepos.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fadyfadd.jparepos.datatransferobjects.InventoryStatusDto;
import org.fadyfadd.jparepos.entities.ActorsByFilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.persistence.TypedQuery;

@Repository
public class AppRepository {

    @Autowired
    EntityManager entityManager;

    public Map<String, Object> getCitiesByCountry(Integer countryId) {
        Map<String, Object> output = new HashMap<String, Object>();
        StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("get_cities_by_country");
        query.setParameter("acity_id", countryId);
        output.put("payLoad", query.getResultList());
        output.put("random_value", query.getOutputParameterValue("random_value"));
        output.put("city_count", query.getOutputParameterValue("city_count"));
        return output;
    }

    public List<ActorsByFilm> getActorsByFilm(Integer filmId) {
        TypedQuery<ActorsByFilm> actors = entityManager.createNamedQuery("actors_by_film", ActorsByFilm.class);
        actors.setParameter("filmId", filmId);
        return actors.getResultList();
    }

    public List<InventoryStatusDto> getInventoryStatusByFilmId(Integer filmId) {
        String queryText = "Select new org.fadyfadd.jparepos.datatransferobjects.InventoryStatusDto(i.inventoryId , f.filmId , f.description , f.title)" +
         " from Inventory i , Film f where i.filmId= f.filmId and (:filmId is null or f.filmId = :filmId) ";
        TypedQuery<InventoryStatusDto> query = entityManager.createQuery(queryText, InventoryStatusDto.class);
        query.setParameter("filmId" , null);
        List<InventoryStatusDto> inventoryStatus =  query.getResultList();
        return inventoryStatus;
    }

}
