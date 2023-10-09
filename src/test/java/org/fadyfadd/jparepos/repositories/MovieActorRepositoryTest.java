package org.fadyfadd.jparepos.repositories;

import java.util.List;

import org.fadyfadd.jparepos.entities.MovieActor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import jakarta.transaction.Transactional;

@SpringBootTest
public class MovieActorRepositoryTest {

  @Autowired
  MovieActorRepository movieActorRepository;

    @Test
    @Transactional
    void findAll_1() {
       List<MovieActor> entities = movieActorRepository.findAll();
       Assert.isTrue(entities.size() > 0, "not valid");
    }
}
