package training.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] extract() {
        lottoNumbers = new int[6];
        count = 0;

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

        return lottoNumbers;
    }
}
