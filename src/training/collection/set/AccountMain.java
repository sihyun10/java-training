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

        Account range = new Account("", 10, "");
        
        SortedSet<Account> underTenSet = accountSet.headSet(range);
        SortedSet<Account> aboveTenSet = accountSet.tailSet(range);

        System.out.println("10살 미만 회원 출력");
        for (Account member : underTenSet) {
            System.out.println(member);
        }

        System.out.println("10살 이상 회원 출력");
        for (Account member : aboveTenSet) {
            System.out.println(member);
        }
    }
}
