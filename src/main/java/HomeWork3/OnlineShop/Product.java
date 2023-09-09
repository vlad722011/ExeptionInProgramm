package HomeWork3.OnlineShop;
public class Product {
    private String name;
    private int availableQuantity;
    private double price;
    public Product(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAvailableQuantity() {
        return availableQuantity;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Книга автора: %s, Цена : %.2f руб., Доступное количество : %d", name, price, availableQuantity);
    }
}

