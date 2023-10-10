package org.fadyfadd.jparepos.repositories;

import org.fadyfadd.jparepos.entities.FilmActor;
import org.fadyfadd.jparepos.entities.FilmActorPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor , FilmActorPrimaryKey> {
    
}
