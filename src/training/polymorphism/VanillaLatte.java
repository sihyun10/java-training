package training.polymorphism;

public class VanillaLatte implements CafeDrink {
    @Override
    public void recipe() {
        System.out.println("바닐라라떼 레시피");
        System.out.println("라떼샷을 뽑는다.");
        System.out.println("바닐라베이스와 샷을 부어준다.");
    }
}
