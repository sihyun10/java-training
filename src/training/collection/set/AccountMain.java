package training.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class AccountMain {
    public static void main(String[] args) {
        TreeSet<Account> accountSet = new TreeSet<>();
        accountSet.add(new Account("홍길동", 12, "honggildong"));
        accountSet.add(new Account("홍길동", 12, "honggildong"));
        accountSet.add(new Account("짱구", 5, "ShinNohara"));
        accountSet.add(new Account("맹구", 5, "boo"));
        accountSet.add(new Account("원숭이", 10, "monkey"));

        for (Account account : accountSet) {
            System.out.println(account);
        }

        printFilteredAccounts(accountSet,10);
    }

    private static void printFilteredAccounts(SortedSet<Account> accounts, int ageThreshold) {;
        System.out.println(ageThreshold + "살 미만 회원 출력");
        SortedSet<Account> underAgeSet = accounts.headSet(new Account("", ageThreshold, ""));
        for (Account member : underAgeSet) {
            System.out.println(member);
        }

        System.out.println(ageThreshold + "살 이상 회원 출력");
        SortedSet<Account> aboveAgeSet = accounts.tailSet(new Account("", ageThreshold, ""));
        for (Account member : aboveAgeSet) {
            System.out.println(member);
        }
    }
}
