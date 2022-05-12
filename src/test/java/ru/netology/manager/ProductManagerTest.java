package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
   Product number1 = new Book (1, "Biography", 20, "P. Ivanov");
   Product number2 = new Smartphone (2, "Xiaomi Mi Lite", 300, "Xiaomi");
   Product number3 = new Smartphone(3, "Samsung Galaxy", 400, "Samsung");
   Product number4 = new Book (4, "Poems", 150, "S. Esenin");


    @Test
    void shouldAdd() {
     ProductManager manager = new ProductManager();

     manager.add(number1);
     manager.add(number4);

     Product[] expected = {number4, number1};
     Product[] actual =manager.getAll();

     assertArrayEquals(expected, actual);
    }



    @Test
    void shouldSearchByText() {
     ProductManager manager = new ProductManager();

     manager.add(number1);
     manager.add(number2);
     manager.add(number3);
     manager.add(number4);

     Product[] expected = {number4};
     Product[] actual = manager.searchBy("Esenin");

     assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
     ProductManager manager = new ProductManager();

     manager.add(number1);
     manager.add(number2);
     manager.add(number3);
     manager.add(number4);

     manager.removeById(2);


     Product[] expected = {number1, number3, number4};
     Product[] actual = manager.getAll();

     assertArrayEquals(expected, actual);
    }

    @Test
    void matches() {
    }
}