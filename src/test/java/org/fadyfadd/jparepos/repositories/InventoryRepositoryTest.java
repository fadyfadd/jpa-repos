package org.fadyfadd.jparepos.repositories;

import java.util.List;
import org.fadyfadd.jparepos.entities.Inventory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import jakarta.transaction.Transactional;

@SpringBootTest
public class InventoryRepositoryTest {
    
    @Autowired
    InventoryRepository inventoryRepository;

    @Test
    @Transactional
    void findAll_1() {
       List<Inventory> inventories =  inventoryRepository.findAll();
       Assert.isTrue(inventories.size() > 0, "non valid");
    }
}
