package org.fadyfadd.jparepos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@NamedQueries({
    @NamedQuery(name="" , query="")
})
@Entity
public class ActorsByMovie {
   
    @Id
    Integer actorId;
    Integer movieId;
    String firstName;
    String lastName;
    String title;
    String description;
}
