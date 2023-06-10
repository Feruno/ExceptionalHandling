package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {

    Product item = new Product(1, "элем I", 111);
    Product item2 = new Product(2, "элем II", 222);
    Product item3 = new Product(3, "элем III", 333);

    @Test
    public void successDeletingExistingElement() {
        ShopRepository shopRepository = new ShopRepository();

        shopRepository.add(item);
        shopRepository.add(item2);

        shopRepository.remove(item2.getId());

        Product[] expected = {item};
        Product[] actual = shopRepository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void successAddElement() {
        ShopRepository shopRepository = new ShopRepository();

        shopRepository.add(item);
        shopRepository.add(item2);
        shopRepository.add(item3);

        Product[] expected = {item,item2,item3};
        Product[] actual = shopRepository.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}