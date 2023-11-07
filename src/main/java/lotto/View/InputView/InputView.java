package lotto.View.InputView;

import lotto.View.GeneralInputOutput.Input;
import lotto.View.GeneralInputOutput.Output;

public class InputView {
    private static final String PURCHASE_AMOUNT_PROMPT = "구입금액을 입력해 주세요.";
    private static final String WINNING_NUMBER_PROMPT = "당첨 번호를 입력해 주세요.";

    private static final String BONUS_NUMBER_PROMPT = "보너스 번호를 입력해 주세요.";
    private final Input GeneralInput = new Input();
    private final Output GeneralOutput = new Output();


    public String getLottoPurchaseAmount() {
        GeneralOutput.stringOutput(PURCHASE_AMOUNT_PROMPT);
        return GeneralInput.stringInput();
    }

    public String getLottoWinningNumber() {
        GeneralOutput.stringOutput(WINNING_NUMBER_PROMPT);
        return GeneralInput.stringInput();
    }

    public String getLottoBonusNumber() {
        GeneralOutput.stringOutput(BONUS_NUMBER_PROMPT);
        return GeneralInput.stringInput();
    }


}