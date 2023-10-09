package org.fadyfadd.jparepos.repositories;

import java.util.List;

import org.fadyfadd.jparepos.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {
  
    @Procedure(procedureName="get_actor_count_by_movie")
    Integer getActorCountByMovie(Integer movieId);

    @Query("select a from Actor a where lastName like %:pattern%")
    List<Actor> searchActorsByLastName( @Param("pattern") String lastNamePattern);

}
