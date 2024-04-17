package training.enum_class;

public enum Membership {
    WHITE(0,"멤버십 전용 이벤트 참여"),
    BLACK(5,"아메리카노 무료 쿠폰"),
    RED(10,"기념일 조각 케이크 무료 쿠폰");

    private final int discountPercent;
    private final String benefits;

    Membership(int discountPercent, String benefits) {
        this.discountPercent = discountPercent;
        this.benefits = benefits;
    }

    public static Membership findByMembershipType(String membershipType) {
        for (Membership membership : values()) {
            if (membership.name().equals(membershipType)) {
                return membership;
            }
        }
        return null;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public String getBenefits() {
        return benefits;
    }

    //할인로직
    public int calculateDiscount(int price) {
        return price * discountPercent / 100;
    }
}
