package org.fadyfadd.jparepos.repositories;

import org.fadyfadd.jparepos.entities.Actor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import jakarta.transaction.Transactional;

import java.util.List;

@SpringBootTest
public class ActorRepositoryTest {

  @Autowired
  ActorRepository actorRepository;

  @Test
  @Transactional
  void getActorCountByMovie_1() {
    int nbrOfActors = actorRepository.getActorCountByMovie(null);
    Assert.isTrue(nbrOfActors > 0, "non valid");
  }

  @Test
  @Transactional
  void searchActorByLastName_1() {
    List<Actor> actors = actorRepository.searchActorsByLastName("a");
    Assert.isTrue(actors.size() > 0 , "not valid");
  }

}
