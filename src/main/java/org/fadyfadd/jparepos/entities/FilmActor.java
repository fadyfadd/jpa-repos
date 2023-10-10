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
public class FilmActor {
    @EmbeddedId
    @AttributeOverrides({
        @AttributeOverride(name="actorId" , column=@Column(name="actor_id")),
        @AttributeOverride(name="filmId" , column=@Column(name="film_id"))
    })
    FilmActorPrimaryKey filmActorPk;
    @Column(name = "last_update")
    Date lastUpdate;
}
