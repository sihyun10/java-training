package training.lotto;

import java.util.Arrays;
import java.util.Random;

/**
 * <로또 번호 추출>
 * 1~45 사이의 값 중 6개 추출
 * 추출된 값은 중복되면 안되며 오름차순으로 정렬
 */
public class LottoMain {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNumbers = new int[6];
        int count = 0;

        while (count < 6) {
            int num = random.nextInt(45) + 1;
            boolean isDuplicate = false;

            for (int i = 0; i < count; i++) {
                if (lottoNumbers[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                lottoNumbers[count] = num;
                count++;
            }
        }

        Arrays.sort(lottoNumbers);

        System.out.println("랜덤 로또 번호를 추출하였습니다.");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }
    }
}
