package training.lotto;

public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] lottoNumbers = lotto.extract();
        System.out.println("랜덤 로또 번호를 추출하였습니다.");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
