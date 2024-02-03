package training.polymorphism;

public class Worker {
    public void made(String drink) {
        CafeDrink cafeDrink = DrinkMenu.menuChoose(drink);
        cafeDrink.recipe();
    }
}
