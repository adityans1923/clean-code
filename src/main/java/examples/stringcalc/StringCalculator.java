package examples.stringcalc;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

  public int Add(String numbers) throws Exception {
    if (numbers.equals(""))
      return 0;

    String[] splittedNumbers = numbers.split(",|\n");
    checkNegativePresent(splittedNumbers);

    int sum = calculateSum(splittedNumbers);

    return sum;
  }

  private int calculateSum(String[] splittedNumbers) {
    int sum = 0;
    for(String n : splittedNumbers) {
      int num = Integer.parseInt(n);
      sum = sum + num;
    }
    return sum;
  }

  private void checkNegativePresent(String[] splitedNumbers) throws Exception {
    List<Integer> negativeNumbers = new ArrayList<>();
    for(String n : splitedNumbers) {
      int num = Integer.parseInt(n);
      if(num < 0) {
        negativeNumbers.add(num);
      }
    }
    if (negativeNumbers.size() > 0) {
      throw new Exception("Negative numbers not allowed. " + negativeNumbers.toString());
    }
  }

}
