package training.collection.set;

import java.util.HashSet;
import java.util.Set;

public class AccountMain {
    public static void main(String[] args) {
        Set<Account> accountSet = new HashSet<>();
        accountSet.add(new Account("홍길동", 12, "honggildong"));
        accountSet.add(new Account("홍길동", 12, "honggildong"));
        accountSet.add(new Account("짱구", 5, "ShinNohara"));
        accountSet.add(new Account("맹구", 5, "boo"));

        for (Account account : accountSet) {
            System.out.println(account);
        }
    }
}
