package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlreadyExistsExceptionTest {

    Product item = new Product(1, "элем I", 111);
    Product item2 = new Product(2, "элем II", 222);

    @Test
    public void AlreadyExists() {
        ShopRepository shopRepository = new ShopRepository();

        shopRepository.add(item);
        shopRepository.add(item2);

        Assertions.assertThrows(AlreadyExistsException.class , () ->{
            shopRepository.add(item2);
        });

    }

}