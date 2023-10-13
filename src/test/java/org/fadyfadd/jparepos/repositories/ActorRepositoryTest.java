package org.fadyfadd.jparepos.repositories;

import org.fadyfadd.jparepos.entities.Actor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.util.Date;
import java.util.List;

@SpringBootTest
@Service
public class ActorRepositoryTest {

  @Autowired
  ActorRepository actorRepository;

  @Test
  @Transactional
  void getActorCountByFilm_1() {
    int nbrOfActors = actorRepository.getActorCountByFilm(null);
    System.out.println(nbrOfActors);
  }

  @Test
  @Transactional
  void searchActorByLastName_1() {
    List<Actor> actors = actorRepository.searchActorsByLastName("a");
   System.out.println(actors);
  }

  @Test
  @Transactional
  void Save_1() {
    Actor toInsert = new Actor(-1 , "John" , "McDonald" ,new Date());
    actorRepository.save(toInsert);
  }

}
