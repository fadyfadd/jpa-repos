package org.fadyfadd.jparepos.repositories;

import org.fadyfadd.jparepos.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {
  
    @Procedure(procedureName = "get_actor_count_by_movie")
    public Integer GetActorCountByMovie(Integer movieId);
}
