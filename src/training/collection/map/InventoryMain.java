package training.collection.map;

public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.inComing(new Product("laptop", 2000000), 20);
        inventory.inComing(new Product("mouse", 10000), 25);
        inventory.inComing(new Product("keyboard", 15000), 10);

        inventory.outGoing(new Product("laptop", 2000000), 17);
        inventory.printAllProducts();

        inventory.inComing(new Product("laptop", 2000000), 8);
        inventory.printAllProducts();
    }
}
