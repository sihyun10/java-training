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

        System.out.println("전체 회원 출력");
        printAccounts(accountSet);

        printFilteredAccounts(accountSet,10);
    }

    private static void printAccounts(SortedSet<Account> accounts) {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    private static void printFilteredAccounts(SortedSet<Account> accounts, int ageThreshold) {;
        System.out.println(ageThreshold + "살 미만 회원 출력");
        SortedSet<Account> underAgeSet = accounts.headSet(new Account("", ageThreshold, ""));
        printAccounts(underAgeSet);

        System.out.println(ageThreshold + "살 이상 회원 출력");
        SortedSet<Account> aboveAgeSet = accounts.tailSet(new Account("", ageThreshold, ""));
        printAccounts(aboveAgeSet);
    }
}
