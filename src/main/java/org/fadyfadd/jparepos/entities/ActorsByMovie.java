package org.fadyfadd.jparepos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;

@NamedQueries({
    @NamedQuery(name="actors_by_movie" , 
    query="select new ActorsByMovie(a.actorId , m.filmId , a.firstName , a.lastName , m.title , m.description)" + 
    " from MovieActor  ma , Movie m , Actor a where ma.filmActorPk.actorId = a.actorId and ma.filmActorPk.filmId = m.filmId and m.filmId = :filmId"
    )
})
@Entity
@AllArgsConstructor
public class ActorsByMovie {
    @Id
    Integer actorId;
    Integer movieId;
    String firstName;
    String lastName;
    String title;
    String description;
}
