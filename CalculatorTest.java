import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;
public class CalculatorTest {
  // @Test
  // public void add() {
  //   Calculator calculator = new Calculator();
  //   int sum = calculator.add("1+2+3");
  //   assertEquals(6, sum);
  // }
  // @Test
  // public void subtract() {
  //   Calculator calculator = new Calculator();
  //   int difference = calculator.subtract("3-2");
  //   assertEquals(1, difference);
  // }
  @Test
  public void createLotteryNumbers() {
    Calculator calculator = new Calculator();
    HashSet<Integer> numbers = calculator.createLotteryNumbers(6);
    assertEquals(6, numbers.size());
    HashSet<Integer> numberstwo = calculator.createLotteryNumbers(5);
    assertEquals(5, numberstwo.size());
  }

  @Test
  public void createPlayerNumbersFromString() {
    Calculator calculator = new Calculator();
    HashSet<Integer> numbers = calculator.createPlayerNumbersFromString("1 2 3 4 5 6");
    assertEquals(6, numbers.size());
  }
}
