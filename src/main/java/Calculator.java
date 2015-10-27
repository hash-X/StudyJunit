/**
 * Created by root on 15-10-27.
 */
public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;
    for (String summand : expression.split("\\+")) {
      sum += Integer.valueOf(summand);
    }
    return sum;
  }
}
