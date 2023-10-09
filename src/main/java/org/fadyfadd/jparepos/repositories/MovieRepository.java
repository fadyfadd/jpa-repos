package org.fadyfadd.jparepos.repositories;
import java.util.List;
import org.fadyfadd.jparepos.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
  
    @Procedure(procedureName = "get_movies_by_release_year")
    public List<Object> getMoviesByReleaseDate(Integer releaseDate);

    @Query("select m from Movie m where title like %:pattern%")
    List<Movie> searchMoviesByTitle( @Param("pattern") String titlePattern);
}
