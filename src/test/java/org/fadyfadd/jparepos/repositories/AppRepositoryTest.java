package org.fadyfadd.jparepos.repositories;
import java.util.List;
import java.util.Map;

import org.fadyfadd.jparepos.datatransferobjects.InventoryStatusDto;
import org.fadyfadd.jparepos.entities.ActorsByFilm;
import org.fadyfadd.jparepos.entities.CitiesByCountry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import jakarta.transaction.Transactional;

@SpringBootTest
public class AppRepositoryTest {
    @Autowired
    AppRepository appRepository;

    @Test
    @SuppressWarnings("unchecked")
    @Transactional
    void getCitiesCountByCountry_1() {
       Map<String,Object> values =  appRepository.getCitiesByCountry(null);
       Assert.isTrue((Double)values.get("random_value") > 0 , "not valid");
       List<CitiesByCountry> cities =  (List<CitiesByCountry>)values.get("payLoad");
       Assert.isTrue(cities.size() > 0 , "not valid");
       Assert.isTrue((Integer)values.get("city_count") > 0 , "not valid");
       
    }

    @Test
    @Transactional
    void getActorsByFilm_1() {
      List<ActorsByFilm> actors = appRepository.getActorsByFilm(1);
      Assert.isTrue(actors.size() > 0, "not valid");
    }

    @Test
    @Transactional
    void getInventoryStatusByFilmId_1(){
      List<InventoryStatusDto> inventoryStatus = appRepository.getInventoryStatusByFilmId(1);
      Assert.isTrue(inventoryStatus.size() > 0, "not valid");
    }


}
