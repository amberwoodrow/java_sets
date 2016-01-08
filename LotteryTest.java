import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;
public class LotteryTest {
  @Test
  public void createLotteryNumbers() {
    LotterySet lotterySet = new LotterySet();
    HashSet<Integer> numbers = lotterySet.createLotteryNumbers(6);
    assertEquals(6, numbers.size());
  }

  @Test
  public void createPlayerNumbersFromString() {
    LotterySet lotterySet = new LotterySet();
    HashSet<Integer> numbers = lotterySet.createPlayerNumbersFromString("1 2 3 4 5 6");
    assertEquals(6, numbers.size());
  }
}
