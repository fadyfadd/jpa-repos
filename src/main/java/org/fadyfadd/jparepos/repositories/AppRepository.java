package org.fadyfadd.jparepos.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fadyfadd.jparepos.entities.ActorsByMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.StoredProcedureQuery;
import jakarta.persistence.TypedQuery;

@Repository
public class AppRepository {
 
    @Autowired
    EntityManager entityManager;
  
    public Map<String,Object> getCitiesByCountry(Integer countryId) {
        Map<String,Object> output = new HashMap<String,Object>();
        StoredProcedureQuery query = entityManager.createNamedStoredProcedureQuery("get_cities_by_country");
        query.setParameter("acity_id" , countryId);
        output.put("payLoad", query.getResultList());
        output.put("random_value", query.getOutputParameterValue("random_value"));
        output.put("city_count" , query.getOutputParameterValue("city_count"));
        return output;
    }

    public List<ActorsByMovie> getActorsByMovie(Integer movieId) {
       TypedQuery<ActorsByMovie> actors = entityManager.createNamedQuery("actors_by_movie", ActorsByMovie.class);
       actors.setParameter("filmId" , movieId);
       return actors.getResultList();
    }


}
