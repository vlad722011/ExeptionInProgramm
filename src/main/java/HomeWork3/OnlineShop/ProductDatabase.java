package HomeWork3.OnlineShop;
import HomeWork3.Expections.DataBaseExpection;
import java.util.ArrayList;
import java.util.List;
public class ProductDatabase {
    private final List<Product> productList;
    public List<Product> getProductList() {
        return productList;
    }
    public ProductDatabase() {
        this.productList = new ArrayList<>();
        this.productList.add(new Product("Омер М. - Тринадцатая карта", 10, 623.50));
        this.productList.add(new Product("Гюйань Т. - Восстание клана Чан", 10, 834.00));
        this.productList.add(new Product("Арден Л. - Мара и Морок", 10, 579.18));
        this.productList.add(new Product("Остен, Джейн - Гордость и предубеждение", 10, 474.69));
        this.productList.add(new Product("Сянь Д. - Удушающая слабость, заиндевелый пепел", 10, 617.00));
        this.productList.add(new Product("Тянься Гюйань - Восхождение фениксов", 10, 834.00));

    }
    public Product getProduct(int productId) throws DataBaseExpection {
        if ((productId > 0) && (productId <= productList.size())) {
            return productList.get(productId - 1);
        }
        throw new DataBaseExpection("Книга не найдена.");
    }
    public void newProductQuantity(Product product, int quantity) {
        product.setAvailableQuantity(product.getAvailableQuantity() - quantity);
    }
}