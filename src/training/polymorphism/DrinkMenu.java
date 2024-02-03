package training.polymorphism;

public abstract class DrinkMenu {
    public static CafeDrink menuChoose(String menu) {
        switch (menu) {
            case "americano" -> {
                return new Americano();
            }
            case "cafeLatte" -> {
                return new CafeLatte();
            }
            case "vanillaLatte" -> {
                return new VanillaLatte();
            }
            default -> {
                return new DefaultDrink();
            }
        }
    }
}
