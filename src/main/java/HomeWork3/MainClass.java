package HomeWork3;
import HomeWork3.OnlineShop.OnlineShopUI;
import HomeWork3.OnlineShop.ProductDatabase;
import HomeWork3.OnlineShop.ShopManager;
public class MainClass{
    public static void main(String[] args) {
        ProductDatabase db = new ProductDatabase();
        ShopManager manager = new ShopManager(db);
        OnlineShopUI onlineShopUI = new OnlineShopUI(manager);
        onlineShopUI.run();
    }
}
