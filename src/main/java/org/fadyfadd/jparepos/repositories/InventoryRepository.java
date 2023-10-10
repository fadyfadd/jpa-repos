package org.fadyfadd.jparepos.repositories;

import org.fadyfadd.jparepos.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Integer>  {
    
}
