package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    private static final int MIN = 1;
    private static final int MAX = 9;
    private static final int NUMBER_LENGTH = 3;
    private List<Integer> answerNumber = new ArrayList<>();

    public void makeAnswerNumber() {
        initAnswerNumber();
        while (answerNumber.size() < NUMBER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(MIN, MAX);
            if (!answerNumber.contains(randomNumber)) {
                answerNumber.add(randomNumber);
            }
        }
    }

    private void initAnswerNumber() {
        answerNumber.clear();
    }

    public List<Integer> getAnswerNumber() {
        return answerNumber;
    }
}
