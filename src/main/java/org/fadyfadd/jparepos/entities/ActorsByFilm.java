package org.fadyfadd.jparepos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import lombok.AllArgsConstructor;

@NamedQueries({
    @NamedQuery(name="actors_by_film" , 
    query="select new ActorsByFilm(a.actorId , m.filmId , a.firstName , a.lastName , m.title , m.description)" + 
    " from FilmActor  ma , Film m , Actor a where ma.filmActorPk.actorId = a.actorId and ma.filmActorPk.filmId = m.filmId and m.filmId = :filmId"
    )
})
@Entity
@AllArgsConstructor
public class ActorsByFilm {
    @Id
    Integer actorId;
    Integer filmId;
    String firstName;
    String lastName;
    String title;
    String description;
}
