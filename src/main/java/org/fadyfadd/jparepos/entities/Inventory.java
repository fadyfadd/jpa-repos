package org.fadyfadd.jparepos.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="inventory")
@Getter
@Setter
public class Inventory {
    @Id
    @Column(name="inventory_id")
    Integer inventoryId;
    @Column(name="film_id")
    Integer filmId;
    @Column(name="store_id")
    Integer storeId;
    @Column(name="last_update")
    Date lastUpdate;

}
