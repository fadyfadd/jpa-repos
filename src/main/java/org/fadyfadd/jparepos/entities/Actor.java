package org.fadyfadd.jparepos.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="actor_id")
    private Integer actorId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="last_update")
    private Date lastUpdate;
}
