package org.fadyfadd.jparepos.repositories;

import org.fadyfadd.jparepos.entities.MovieActor;
import org.fadyfadd.jparepos.entities.MovieActorPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieActorRepository extends JpaRepository<MovieActor , MovieActorPrimaryKey> {
    
}
