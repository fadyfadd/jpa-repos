package org.fadyfadd.jparepos.repositories;

import java.util.List;

import org.fadyfadd.jparepos.entities.Film;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import jakarta.transaction.Transactional;

@SpringBootTest
public class FilmRepositoryTest {
    @Autowired
    FilmRepository filmRepository;

    @Test
    @Transactional
    void getFilmsByReleaseDate_1() {
       List<Object> films = filmRepository.getFilmsByReleaseDate(2006);
       System.out.println(films);
    }

    @Test
    @Transactional
    void searchFilmsByTitle_1() {
       List<Film> films = filmRepository.searchFilmsByTitle("a");
       System.out.println(films);
    }

   
}
