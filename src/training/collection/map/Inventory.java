package training.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private static final int WARNING_THRESHOLD = 5;
    private final Map<Product, Integer> inventoryMap = new HashMap<>();

    public void inComing(Product product, int quantity) {
        int addQuantity = inventoryMap.getOrDefault(product, 0) + quantity;
        inventoryMap.put(product, addQuantity);
        checkWarning(product, addQuantity);
    }

    public void outGoing(Product product, int quantity) {
        int minusQuantity = inventoryMap.getOrDefault(product, 0) - quantity;

        if (minusQuantity <= 0) {
            inventoryMap.remove(product);
        } else {
            inventoryMap.put(product, minusQuantity);
            checkWarning(product, minusQuantity);
        }
    }

    public void printAllProducts() {
        System.out.println("현재 재고 상황");
        for (Map.Entry<Product, Integer> integerEntry : inventoryMap.entrySet()) {
            System.out.println(integerEntry.getKey() + ": " + integerEntry.getValue());
        }
    }

    private void checkWarning(Product product, int quantity) {
        if (quantity <= WARNING_THRESHOLD) {
            System.out.println("경고: " + product.getName() + "의 재고가 " + quantity + "개 이므로 제품 입고를 고려해주세요");
        }
    }
}
