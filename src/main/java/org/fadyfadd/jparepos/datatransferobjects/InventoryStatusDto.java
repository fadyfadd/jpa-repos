package org.fadyfadd.jparepos.datatransferobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class InventoryStatusDto {
    Integer inventoryId;
    Integer filmId;
    String filmDescription;
    String filmTitle;
}
