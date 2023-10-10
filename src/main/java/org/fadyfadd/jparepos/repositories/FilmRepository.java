package org.fadyfadd.jparepos.repositories;
import java.util.List;
import org.fadyfadd.jparepos.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film,Integer> {
  
    @Procedure(procedureName = "get_movies_by_release_year")
    public List<Object> getFilmsByReleaseDate(Integer releaseDate);

    @Query("select m from Film m where title like %:pattern%")
    List<Film> searchFilmsByTitle( @Param("pattern") String titlePattern);
}
