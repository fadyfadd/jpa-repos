package org.fadyfadd.jparepos.datatransferobjects;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InventoryStatusDto {
    Integer inventoryId;
    String movieId;
    String movieDescription;
    String movieTitle;
}
