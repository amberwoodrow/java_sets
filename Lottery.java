import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LotterySet {
  public static void main (String[] args) throws java.lang.Exception {
    LotterySet c = new LotterySet();
    c.playLottery();
  }

  public HashSet<Integer> createPlayerNumbers() {
    System.out.print("Enter six unique numbers sperated by spaces: ");
    Scanner scan = new Scanner(System.in);
    String numberStr = scan.nextLine();

    HashSet<Integer> userNumbers = createPlayerNumbersFromString(numberStr);

    return userNumbers;
  }

  public HashSet<Integer> createPlayerNumbersFromString(String numberStr){
    HashSet<Integer> userNumbers = new HashSet<Integer>();
    String[] numbersSplit = numberStr.split(" ");

    for(int i = 0; i < numbersSplit.length ; i++){
      userNumbers.add(Integer.parseInt(numbersSplit[i]));
    }

    return userNumbers;
  }

  public HashSet<Integer> createLotteryNumbers(Integer count) {
    HashSet<Integer> lotteryNumbers = new HashSet<Integer>();

    while(lotteryNumbers.size() < count){
      Random rand = new Random();
      lotteryNumbers.add(rand.nextInt(50));
    }
    return lotteryNumbers;
  }

  // public void compareWinnings(HashSet<Integer> player, HashSet<Integer> lottery) {
  //
  // }

  public void playLottery() {
    // get player input
    createPlayerNumbers();
    //
  }

}
