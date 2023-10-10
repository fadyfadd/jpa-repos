package org.fadyfadd.jparepos.datatransferobjects;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InventoryStatusDto {
    Integer inventoryId;
    String filmId;
    String filmDescription;
    String filmTitle;
}
