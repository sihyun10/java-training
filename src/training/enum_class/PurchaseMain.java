package training.enum_class;

import java.util.Scanner;

public class PurchaseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = 24000;

        System.out.print("반갑습니다. 멤버 등급을 입력해주세요[WHITE,BLACK,RED]: ");
        String membership = scanner.nextLine();

        Membership level = Membership.valueOf(membership.toUpperCase());
        int discountPrice = level.discount(price);
        int payment = price - discountPrice;

        System.out.println("할인 금액은 " + discountPrice + "원입니다.");
        System.out.println("결제 금액은 " + payment + "원이며, 혜택은 " + level.getBenefits() + "입니다.");
    }
}
