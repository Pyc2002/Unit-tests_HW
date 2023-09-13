package seminars.first.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Shop {
    private List<Product> products;

    public Shop(){
        this(new ArrayList<>());
    }

    public Shop(List<Product> products) {
       this.products = products;
    }



    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product){
        products.add(product);
    }

    @Override
    public String toString(){
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("В магазине ");
        sb.append(products.size());
        sb.append(" позиций продуктов: \n");
        for (Product product: products ){
            sb.append(product);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public List<Product> getSortedListProducts() {
        products.sort((o1, o2) -> o2.getCost() - o1.getCost());
        return  products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct() {
        return getSortedListProducts().get(0);
    }


}