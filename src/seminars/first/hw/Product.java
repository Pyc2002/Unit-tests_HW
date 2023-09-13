package seminars.first.hw;

public class Product {
    private int cost; // Стоимость продукта
    private String title; // Название

    public Product(int cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append(", стоимость: "+ cost);
        return sb.toString();
    }
    @Override
    public String toString() {
        return getInfo();
    }
}