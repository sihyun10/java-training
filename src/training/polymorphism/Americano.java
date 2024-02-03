package training.polymorphism;

public class Americano implements CafeDrink {
    @Override
    public void recipe() {
        System.out.println("아메리카노 레시피");
        System.out.println("에스프레소샷을 뽑는다.");
        System.out.println("얼음을 담고 샷을 부어준다.");
    }
}
