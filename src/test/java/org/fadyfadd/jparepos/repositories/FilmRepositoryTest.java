package org.fadyfadd.jparepos.repositories;

import java.util.List;

import org.fadyfadd.jparepos.entities.Film;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import jakarta.transaction.Transactional;

@SpringBootTest
public class FilmRepositoryTest {
    @Autowired
    FilmRepository filmRepository;

    @Test
    @Transactional
    void getFilmsByReleaseDate_1() {
       List<Object> films = filmRepository.getFilmsByReleaseDate(2006);
       Assert.isTrue(films.size() > 0, "not valid");
    }

    @Test
    @Transactional
    void searchFilmsByTitle_1() {
       List<Film> films = filmRepository.searchFilmsByTitle("a");
       Assert.isTrue(films.size() > 0, "not valid");
    }

   
}
