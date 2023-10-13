package org.fadyfadd.jparepos.repositories;

import java.util.List;
import java.util.Optional;

import org.fadyfadd.jparepos.entities.FilmActor;
import org.fadyfadd.jparepos.entities.FilmActorPrimaryKey;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import jakarta.transaction.Transactional;

@SpringBootTest
public class FilmActorRepositoryTest {

  @Autowired
  FilmActorRepository filmActorRepository;

    @Test
    @Transactional
    void findAll_1() {
       List<FilmActor> entities = filmActorRepository.findAll();
       System.out.print(entities);
    }

    @Test
    @Transactional
    void findById_1() {
      Optional<FilmActor> singleEntity = filmActorRepository.findById(new FilmActorPrimaryKey(1, 1));
      
      if (singleEntity.isPresent())
      {
          FilmActor fa = singleEntity.get(); 
          System.out.println(fa);
      }
     
    }
}
