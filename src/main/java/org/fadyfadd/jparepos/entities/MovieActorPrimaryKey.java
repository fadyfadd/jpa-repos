package org.fadyfadd.jparepos.entities;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class MovieActorPrimaryKey {
    private Integer actorId;
    private Integer filmId;
}
