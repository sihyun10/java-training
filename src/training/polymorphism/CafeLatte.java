package training.polymorphism;

public class CafeLatte extends CafeDrink {
    @Override
    public void recipe() {
        System.out.println("카페라떼 레시피");
        System.out.println("라떼샷을 뽑는다.");
        System.out.println("우유를 넣은 뒤, 샷을 부어준다.");
    }
}
