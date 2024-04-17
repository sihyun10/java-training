package training.enum_class;

import java.util.Scanner;

public class PurchaseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = 24000;

        System.out.print("반갑습니다. 멤버 등급을 입력해주세요[WHITE,BLACK,RED]: ");
        String membershipType = scanner.nextLine();
        Membership membership = Membership.findByMembershipType(membershipType.toUpperCase());

        if (membership == null) {
            System.out.println("잘못된 멤버 등급입니다.");
        } else {
            int discountAmount = membership.calculateDiscount(price);
            int discountedPrice = price - discountAmount;
            System.out.println("할인 금액은 " + discountAmount + "원입니다.");
            System.out.println("결제 금액은 " + discountedPrice + "원이며, 혜택은 " + membership.getBenefits() + "입니다.");
        }
    }
}
