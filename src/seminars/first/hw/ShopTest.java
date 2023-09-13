package seminars.first.hw;

import org.assertj.core.api.Assert;
import seminars.first.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static seminars.first.hw.Product.*;
import static seminars.first.hw.Shop.*;

public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */


    public static void testList(Shop shop){
        List<String> list = Arrays.asList("Яблоко", "Морковь","Помидор","Картофель");
        assertThat(shop.getProducts()).hasSize(4);
        for (int i = 0; i < shop.getProducts().size(); i++) {
            assertThat(shop.getProducts().get(i).getTitle()).isEqualTo(list.get(i));
        }
    }

    public static void testGetMostExpensiveProduct(Shop shop){
        assertThat(shop.getMostExpensiveProduct().getTitle()).isEqualTo("Помидор");
    }

    public static void testGetSortedListProducts(Shop shop){
        List<Integer> list = Arrays.asList(200, 150, 100,  75);
        for (int i = 0; i < shop.getProducts().size(); i++) {
            assertThat(shop.getSortedListProducts().get(i).getCost()).isEqualTo(list.get(i));
        }
    }

}




