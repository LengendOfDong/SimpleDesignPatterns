/**
 * @author dadongge
 * @date 2020/4/12
 */
public interface Calculator {
    //Create Memento
    PreviousCalculationToCareTaker backupLastCalculation();

    //setMemento
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
