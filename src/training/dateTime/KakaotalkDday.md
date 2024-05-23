자바 날짜와 시간 라이브러리를 활용하여 카카오톡 디데이 기능을 구현해보자.

- 카카오톡의 디데이 기능  
  - 다가오는 디데이 (`D-18`)
  - 얼만큼 흘렀는지 세주는 디데이 (`D+74`)

<img src="https://github.com/sihyun10/java-training/assets/92582664/a1d4a31c-e43b-4bb8-a16d-ca35a7bc99ab" with="160" height="250"/>

<img src="https://github.com/sihyun10/java-training/assets/92582664/022e9451-6243-4d2f-954a-61c5fae92f90" with="160" height="250"/>   

카카오톡에서 디데이를 추가하고자 할때,   
**날짜 선택**, **설정일로부터 1일**(디데이 날짜를 1일로 포함 여부) 을 선택해주어야 한다.   

---------------------------------

- 카카오톡 디데이 기능 구현  
1) 설정하고자 하는 날짜를 입력받는다.  
  1-1) `2024.05.31` 형식으로 입력받는다.

2) 오늘 날짜와 설정한 날짜를 비교한다.  

3) 설정한 날짜가 오늘 날짜보다 이전이라면 얼마나 흘렀는지 세주는 디데이 출력  
  3-1) 설정일로부터 1일 포함이면, 1일 포함해서 디데이 계산  
  3-2) 설정일로부터 1일 포함이 아니라면, 1일 포함 안하고 디데이 계산  
4) 설정한 날짜가 오늘 날짜보다 이후라면 다가오는 디데이 출력  
 이때는 1일 포함o or 1일 포함x => 둘다 값이 똑같다고 **가정**한다.  
 따라서 그냥 디데이를 구해주면 된다.
5) 설정한 날짜가 오늘 날짜와 같은 경우  
  5-1) 설정일로부터 1일 포함이면, 1일 포함해서 디데이 계산  
  5-2) 설정일로부터 1일 포함이 아니라면, `D-DAY` 출력

----------------------------------

### 예외 처리

1) 설정하고자 하는 날짜를 잘못 입력하면 예외 발생   
`DateTimeParseException`예외가 발생하게 된다.

```dtd
설정하고자 하는 날짜를 입력해주세요[2024.05.14]: 20240512
설정 날짜를 1일로 포함하겠습니까?[네/아니오]: 아니오
Exception in thread "main" java.time.format.DateTimeParseException: Text '20240512' could not be parsed at index 0
	at java.base/java.time.format.DateTimeFormatter.parseResolved0(DateTimeFormatter.java:2108)
	at java.base/java.time.format.DateTimeFormatter.parse(DateTimeFormatter.java:2010)
	at java.base/java.time.LocalDate.parse(LocalDate.java:435)
	at training.dateTime.DateCalculator.calculateDday(DateCalculator.java:12)
	at training.dateTime.KakaoDday.main(KakaoDday.java:20)
```
