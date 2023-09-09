package HomeWork3.OnlineShop;
import HomeWork3.Expections.DataBaseExpection;
import HomeWork3.Expections.ShopManagerExpection;
import java.util.List;
import java.util.Scanner;
public class OnlineShopUI {
    private final Scanner scanner = new Scanner(System.in);
    private final ShopManager shopManager;
    public OnlineShopUI(ShopManager shopManager) {
        this.shopManager = shopManager;
    }
    public void run() {
        System.out.println("Вы в онлайн магазине книг. Ниже представлены доступные команды.");
        availableCommand();
        while (true) {
            System.out.print("Выберите команду :");
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> listProduct();
                case "2" -> buyProduct();
                case "0" -> {
                    return;
                }
                default -> availableCommand();
            }
        }
    }
    private void buyProduct() {
        int productId = getInt(" Id товара");
        int quantity = getInt("количество товара");
        try {
            double sum = shopManager.purchaseProduct(productId, quantity);
            System.out.println("Сумма заказа составит: " + sum + "руб.");
        } catch (DataBaseExpection | ShopManagerExpection e) {
            System.out.println(e.getMessage());
        }
    }
    private int getInt(String name) {
        System.out.print("Выберите - " + name + ": ");
        String input = scanner.nextLine();
        while (!input.matches("[\\d]{1,9}")) {
            System.out.print( "Введите корректные значения " + name + ": ");
            input = scanner.nextLine();
        }
        return Integer.parseInt(input);
    }
    private void availableCommand() {
        System.out.println("""
                1 - увидеть список доступных товаров.
                2 - выбрать товары для покупки.
                0 - выход из магазина.""");
    }
    private void listProduct() {
        List<Product> products = shopManager.getAllProducts();
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Id: " + (i + 1) + ",  " + products.get(i));
        }
    }
}