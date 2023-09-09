package HomeWork3.OnlineShop;
import HomeWork3.Expections.DataBaseExpection;
import HomeWork3.Expections.ShopManagerExpection;
import java.util.List;
public class ShopManager {
    private static ProductDatabase dataBase;
    public ShopManager(ProductDatabase dataBase) {
        this.dataBase = dataBase;
    }
    public static double purchaseProduct(int productId, int quantity)  throws DataBaseExpection, ShopManagerExpection {
        Product product = dataBase.getProduct(productId);
        if (product.getAvailableQuantity() < quantity) {
            throw new ShopManagerExpection("Нет такого количества данного товара.");
        }
        double totalPrice = product.getPrice() * quantity;
        dataBase.newProductQuantity(product, quantity);
        return totalPrice;
    }
    public List<Product> getAllProducts() {
        return dataBase.getProductList();
    }
}
