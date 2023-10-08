package org.fadyfadd.jparepos.repositories;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
public class ActorRepositoryTest {
    
    @Autowired
    ActorRepository actorRepository;

    @Test
    void GetActorCountByMovie() {
      int nbrOfActors =  actorRepository.GetActorCountByMovie(null);
      Assert.isTrue(nbrOfActors > 0, "non valid");
    }

}
