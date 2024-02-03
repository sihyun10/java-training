package training.polymorphism;

public class DefaultDrink implements CafeDrink {
    @Override
    public void recipe() {
        System.out.println("없는 메뉴입니다.");
    }
}
