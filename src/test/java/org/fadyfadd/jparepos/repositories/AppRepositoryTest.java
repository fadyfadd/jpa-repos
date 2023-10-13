package org.fadyfadd.jparepos.repositories;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.fadyfadd.jparepos.datatransferobjects.InventoryStatusDto;
import org.fadyfadd.jparepos.entities.Actor;
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
       System.out.println(cities);
       System.out.println((Integer)values.get("city_count"));
       
    }

    @Test
    @Transactional
    void getActorsByFilm_1() {
      List<ActorsByFilm> actors = appRepository.getActorsByFilm(1);
      System.out.println(actors);
    }

    @Test
    @Transactional
    void getInventoryStatusByFilmId_1(){
      List<InventoryStatusDto> inventoryStatus = appRepository.getInventoryStatusByFilmId(1);
      System.out.println(inventoryStatus);
    }

    @Test
    @Transactional
    void saveActor_1() {
      appRepository.saveActor(new Actor(null, "John" , "McDonald" , new Date()));
    }

}
