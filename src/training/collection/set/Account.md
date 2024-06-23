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


