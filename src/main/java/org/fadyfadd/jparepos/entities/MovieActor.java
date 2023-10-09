package org.fadyfadd.jparepos.entities;

import java.util.Date;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="film_actor")
public class MovieActor {
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name="actorId" , column=@Column(name="actor_id")),
        @AttributeOverride(name="movieId" , column=@Column(name="movie_id"))
    })
    MovieActorPrimaryKey filmActorPk;
    @Column(name = "last_update")
    Date lastUpdate;
}
