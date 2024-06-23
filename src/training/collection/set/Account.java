package training.collection.set;

import java.util.Objects;

public class Account implements Comparable<Account> {
    private final String name;
    private final int age;
    private final String id;

    public Account(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return age == account.age && Objects.equals(name, account.name) && Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    @Override
    public int compareTo(Account account) {
        if (this.age == account.age) {
            return this.name.compareTo(account.name);
        }
        return this.age - account.age;
    }
}
