package org.fadyfadd.jparepos.repositories;

import java.util.List;

import org.fadyfadd.jparepos.entities.FilmActor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import jakarta.transaction.Transactional;

@SpringBootTest
public class FilmActorRepositoryTest {

  @Autowired
  FilmActorRepository filmActorRepository;

    @Test
    @Transactional
    void findAll_1() {
       List<FilmActor> entities = filmActorRepository.findAll();
       Assert.isTrue(entities.size() > 0, "not valid");
    }
}
