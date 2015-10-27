import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by root on 15-10-27.
 */
public class JunitAnnotation {
  Calculator calculator = new Calculator();

  @BeforeClass
  public static void beforeClass() {
    System.out.println("@beforeClass");
  }

  @Before
  public void before() {
    System.out.println("@before  initing ....");
  }

  @Test
  public void evaluateExpression() {
    System.out.println("@test");
    Calculator calculator = new Calculator();
    int sum = calculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }

  @After
  public void after() {
    System.out.println("@after  close resource ...");
  }

}
