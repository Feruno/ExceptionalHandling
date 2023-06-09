package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotFoundExceptionTest {

    Product item = new Product(0, "элем I", 111);
    Product item2 = new Product(1, "элем II", 222);

    @Test
    public void generationNotFoundException() {
        ShopRepository shopRepository = new ShopRepository();

        shopRepository.add(item);
        shopRepository.add(item2);

        shopRepository.remove(item2.getId());


        Assertions.assertThrows(NotFoundException.class , () ->{
            shopRepository.remove(-11);
        });

    }

}