import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Calculator {
  public static void main (String[] args) throws java.lang.Exception {
    Calculator c = new Calculator();
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


  // public static void main (String[] args) throws java.lang.Exception {
  //   Calculator c = new Calculator();
  //   System.out.println(c.add("5+5"));
  //   System.out.println(c.subtract("5-5"));
  // }
  // public int add(String expression) {
  //   int sum = 0;
  //   for (String summand: expression.split("\\+"))
  //     sum += Integer.valueOf(summand);
  //   return sum;
  // }
  //
  // public int subtract(String expression) {
  //   int difference = 0;
  //   for (String diffand: expression.split("\\-")) {
  //     if (difference == 0) {
  //       difference = Integer.valueOf(diffand);
  //     } else {
  //       difference -= Integer.valueOf(diffand);
  //     }
  //   }
  //   return difference;
  // }
}
