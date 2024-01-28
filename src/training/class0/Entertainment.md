## 문제 - 연예인 기획사 가수(그룹) 관리

- ```EntertainmentAgency```라는 클래스를 생성 후, 멤버변수는 아래와 같다.
  - 그룹명(```groupName```)
  - 총 인원(```people```)
  - 대표노래(```song```)
- ```EntertainmentAgencyMain```클래스에서 기획사에 속해있는 그룹들의 정보들을 선언 후 출력.

```java
public class EntertainmentAgency {
    String groupName;
    int people;
    String song;
}
```

#### 실행 결과 예시
```
그룹 있지는 총 5명의 인원이며, 대표노래로는 DALLA DALLA라는 곡이 있다.
그룹 엔믹스는 총 6명의 인원이며, 대표노래로는 DASH라는 곡이 있다.
그룹 데이식스는 총 4명의 인원이며, 대표노래로는 예뻤어라는 곡이 있다.
```

---------------------

#### 클래스란?
여러가지 정보들이 하나의 개념으로 묶을 수 있다면 **클래스**라는 개념을 사용해 관리하면 된다.  
위의 문제 예시처럼 JYP라는 연예인 기획사가 있고, ```ITZY(있지), NMIXX(엔믹스), DAY6(데이식스), StrayKids(스트레이키즈)```등 그룹 아티스트들이 속해있다.  

클래스안에 선언한 변수는 **멤버변수(필드)** 라 한다.  
선언할때, 자동으로 초기화해준다. (tip. 선언할때, 직접 초기화해주어도 됨!)

```java
//예시
public class EntertainmentAgency {
    String groupName; //null
    int people; // 0
    String song; // null
}
```

이렇게 클래스에서 나온 실체 ```itzy```, ```nmixx```, ```day6```는 **객체**라 한다.  
그리고 ```itzy```는 ```EntertainmentAgency```클래스의 **인스턴스**다.

```java
EntertainmentAgency itzy = new EntertainmentAgency();
itzy.groupName = "있지";
itzy.people = 5;
itzy.song = "DALLA DALLA";
```