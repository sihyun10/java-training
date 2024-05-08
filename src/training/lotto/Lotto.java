package training.lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;
    private final int totalNumber;

    Lotto(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public int[] extract() {
        lottoNumbers = new int[totalNumber];

        while (count < totalNumber) {
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
