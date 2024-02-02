package training.polymorphism;

public class CafeOrderMain {
    public static void main(String[] args) {
        Americano americano = new Americano();
        CafeLatte cafeLatte = new CafeLatte();
        VanillaLatte vanillaLatte = new VanillaLatte();

        CafeDrink[] drinks = {americano, cafeLatte, vanillaLatte};

        for (CafeDrink drink : drinks) {
            comeOut(drink);
        }
    }

    private static void comeOut(CafeDrink drink) {
        drink.recipe();
        System.out.println("음료 완료되었습니다.");
    }
}
