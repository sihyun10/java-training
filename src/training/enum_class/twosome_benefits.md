카페 투썸은 손님의 등급에 따라 혜택이 주어진다.  
(*실제 혜택과 다른 점이 있음에 유의*)  

등급은 총 3가지가 있다.   
**WHITE**, **BLACK**, **RED**이다.  

<등급 혜택>     
- **WHITE**
  - 결제 시 할인 x
  - 멤버십 전용 이벤트 참여  
- **BLACK** 
  - 결제 시 5% 할인
  - 아메리카노 무료 쿠폰 증정
  - 멤버십 전용 이벤트 참여
- **RED**  
  - 결제 시 10% 할인
  - 기념일 조각 케이크 무료 쿠폰 발행
  - 멤버십 전용 이벤트 참여

----------------------------------

### 문제 - 투썸 등급에 따라 혜택 제공  

총 3개의 등급에 따라 혜택을 제공하자.   
`Membership` 열거형을 만들어라.

- WHITE
  - discountPercent: 0
  - benefits: "멤버십 전용 이벤트 참여"
- BLACK
  - discountPercent: 5
  - benefits: "아메리카노 무료 쿠폰"
- RED
  - discountPercent: 10
  - benefits: "기념일 조각 케이크 무료 쿠폰"  

```java
package training.enum_class;

public enum Membership {
    
}
```

멤버십 등급을 입력받아, `Membership` 열거형으로 변환한 다음에 멤버십 등급에 따라 혜택을 제공하자.    

### 출력 예시  

- 멤버 등급을 소문자로 작성하여도 출력되게 해라.  
- `할인금액`, `결제금액`, `혜택`을 출력해라.  
- 잘못된 멤버 등급이 입력되면 `잘못된 멤버 등급입니다.`를 출력하자.

```
반갑습니다. 멤버 등급을 입력해주세요[WHITE,BLACK,RED]: white
할인 금액은 0원입니다.
결제 금액은 24000원이며, 혜택은 멤버십 전용 이벤트 참여입니다.
```

```
반갑습니다. 멤버 등급을 입력해주세요[WHITE,BLACK,RED]: RED
할인 금액은 2400원입니다.
결제 금액은 21600원이며, 혜택은 기념일 조각 케이크 무료 쿠폰입니다.
```

```
반갑습니다. 멤버 등급을 입력해주세요[WHITE,BLACK,RED]: BLUE
잘못된 멤버 등급입니다.
```




