/**
 * https://github.com/junit-team/junit/wiki/Download-and-Install
 * https://github.com/junit-team/junit/wiki/Getting-started
 * http://junit.org/
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
  @Test
  public void evaluateExpression() {
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}
