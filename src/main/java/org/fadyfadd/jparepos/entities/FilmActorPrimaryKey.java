package org.fadyfadd.jparepos.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
public class FilmActorPrimaryKey {
    private Integer actorId;
    private Integer filmId;

    public FilmActorPrimaryKey() {
        
    }
}
