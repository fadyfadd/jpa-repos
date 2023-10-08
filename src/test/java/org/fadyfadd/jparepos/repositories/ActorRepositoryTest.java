package org.fadyfadd.jparepos.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import jakarta.transaction.Transactional;

@SpringBootTest
public class ActorRepositoryTest {
    
    @Autowired
    ActorRepository actorRepository;

    @Test
    @Transactional
    void GetActorCountByMovie_1() {
       Integer count =  actorRepository.GetActorCountByMovie(1);
       Assert.isTrue(count > 0, "not valid");
    }
}
