### 회원가입 기능 간단히 구현  

웹사이트에서 회원가입을 하려할 때, 정보들을 입력받게 된다.  
입력받은 정보로 가입한적이 없는 회원이라면 가입 절차가 진행되지만,  
가입한적이 있는 회원이라면 가입 절차가 진행되지않고 `아이디찾기, 비번찾기`등의 방법을 권한다.  

위와같은 상황을 Java가 제공하는 컬렉션프레임워크의 `Set`을 사용해 구현해보자.

- 사용자가 회원가입을 하려한다.   
  - 이름
  - 나이
  - 아이디
- 위 3가지 사항을 입력하면 회원가입이 된다.  
- 하지만, 위 3가지 사항이 같다면 중복 회원이 발생하기 때문에 가입하지 못한다.  

-----------------------------------------------

#### 예시 1  

```dtd
홍길동, 12, honggildong 
짱구, 5, ShinNohara
맹구, 5, boo
```

위 3명의 사용자를 Set 인터페이스에 정의되어있는 `add()` 메서드를 사용해 값을 추가하자.  
(혹, 중복된 사용자가 입력되면 그 값은 추가되지 않는다.)  

```java
//예시
public class AccountMain {
    public static void main(String[] args) {
        Set<Account> accountSet = new HashSet<>();
        accountSet.add(new Account("홍길동", 12, "honggildong")); //true
        accountSet.add(new Account("홍길동", 12, "honggildong")); //false
    }
}
```

똑같은 회원정보가 있는경우 `false`를 반환하고 값을 추가하지않는다.  
이것이 Set 자료구조의 특징이다.   

<br>

#### (참고)   

```java
boolean result = accountSet.contains(new Account("짱구", 5, "ShinNohara"));
System.out.println("찾으시는 회원이 있습니까? " + result); //true
```

`contains()` 메서드를 통해 `accountSet`에 이 회원이 있는지 검색할 수 있다.  

-----------------------------------------------------------------

#### 예제 2  

`TreeSet`은 데이터값을 기준으로 정렬하는 특징을 가지고 있다.  
이 특징을 살려 회원이 가입될때, 정렬이 되도록 하자.  

회원은 `이름`, `나이`, `아이디` 로 가입이 된다.  
`나이` 순으로 정렬하되, `나이`가 같으면 `이름`을 기준으로 정렬시킨다.  

```java
public class Account implements Comparable<Account> {
  ...
}
```

```java
@Override
public int compareTo(Account account) {
    if (this.age == account.age) {
        return this.name.compareTo(account.name);
    }
    return this.age - account.age;
}
```

`compareTo()` 메서드를 오버라이딩해서 나이, 이름을 기준으로 비교할 수 있게 한다.  
따라서 이 메서드를 사용해 객체들이 정렬한다.  

```java
//예시
public class AccountMain {
  public static void main(String[] args) {
      TreeSet<Account> accountSet = new TreeSet<>();
      accountSet.add(new Account("홍길동", 12, "honggildong"));
      accountSet.add(new Account("홍길동", 12, "honggildong"));
      accountSet.add(new Account("짱구", 5, "ShinNohara"));
      accountSet.add(new Account("맹구", 5, "boo"));
      accountSet.add(new Account("원숭이", 10, "monkey"));
  }  
}
```
```dtd
Account{name='맹구', age=5, id='boo'}
Account{name='짱구', age=5, id='ShinNohara'}
Account{name='원숭이', age=10, id='monkey'}
Account{name='홍길동', age=12, id='honggildong'}
```

나이(`age`) 순서대로 오름차순 정렬이 되었고, 나이가 같으면 이름(`name`)을 기준으로 정렬된다.  

<br>

**+) 추가**  

#### 지정된 나이 값보다 크거나 작은 회원 검색 기능  

`TreeSet`에서 제공하는 `headSet(E toElement)`, `tailSet(E fromElement)` 메서드를 활용하여 10세 미만, 10세 이상 회원을 구분하여 출력해보자.  

- `headSet(E toElement)`: 파라미터보다 작은 값 반환 (to 요소 제외)
- `tailSet(E fromElement)`: 파라미터보다 큰 값 반환 (from 요소 포함)  

```java
Account range = new Account("", 10, "");
SortedSet<Account> underTenSet = accountSet.headSet(range); //10살 미만
SortedSet<Account> aboveTenSet = accountSet.tailSet(range); //10살 이상
```

--------------------------------------------------

#### 예제 3  

현재 출력되고 있는 코드 부분이 비슷하다.  
메서드로 분리해보자! 재사용성을 높여보자.  

```java
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
```

몇 살을 기준으로 출력할껀지 매개변수로 입력받으면 미만 회원, 이상 회원이 출력되게끔 메서드로 구현하였다.

하지만, 전체 회원을 출력하는 코드든 `printFilteredAccounts()`메서드를 보면   
아래 코드와 같이 출력되는 코드 부분이 똑같다.   
이 부분도 메서드로 분리하자!  

```java
for (Account account : accountSet) {
    System.out.println(account);
}

for (Account member : underAgeSet) {
    System.out.println(member);
}

for (Account member : aboveAgeSet) {
    System.out.println(member);
}
```

아래와 같이 메서드(`printAccounts()`)로 분리하였다.
```java
private static void printAccounts(SortedSet<Account> accounts) {
    for (Account account : accounts) {
        System.out.println(account);
    }
}
```
------------------------------------------------------

#### 최종 출력 코드  

```
전체 회원 출력
Account{name='맹구', age=5, id='boo'}
Account{name='짱구', age=5, id='ShinNohara'}
Account{name='원숭이', age=10, id='monkey'}
Account{name='홍길동', age=12, id='honggildong'}
10살 미만 회원 출력
Account{name='맹구', age=5, id='boo'}
Account{name='짱구', age=5, id='ShinNohara'}
10살 이상 회원 출력
Account{name='원숭이', age=10, id='monkey'}
Account{name='홍길동', age=12, id='honggildong'}
```