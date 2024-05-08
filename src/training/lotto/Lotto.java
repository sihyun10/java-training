package training.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] extract() {
        lottoNumbers = new int[6];

        while (count < 6) {
            int num = extractNumber();
            if (!isDuplicate(num)) {
                lottoNumbers[count] = num;
                count++;
            }
        }

        sortNumbers();
        return lottoNumbers;
    }

    private int extractNumber() {
        return random.nextInt(45) + 1;
    }

    private boolean isDuplicate(int num) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == num) {
                return true;
            }
        }
        return false;
    }

    private void sortNumbers() {
        Arrays.sort(lottoNumbers);
    }
}
