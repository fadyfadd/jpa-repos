package org.fadyfadd.jparepos.repositories;

import java.util.List;

import org.fadyfadd.jparepos.entities.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import jakarta.transaction.Transactional;

@SpringBootTest
public class MovieRepositoryTest {
    @Autowired
    MovieRepository movieRepository;

    @Test
    @Transactional
    void getMoviesByReleaseDate_1() {
       List<Object> movies = movieRepository.getMoviesByReleaseDate(2006);
       Assert.isTrue(movies.size() > 0, "not valid");
    }

    @Test
    @Transactional
    void searchMoviesByTitle_1() {
       List<Movie> movies = movieRepository.searchMoviesByTitle("a");
       Assert.isTrue(movies.size() > 0, "not valid");
    }

   
}
