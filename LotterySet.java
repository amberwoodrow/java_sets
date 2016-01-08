import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LotterySet {
  public static void main (String[] args) throws java.lang.Exception {
    LotterySet c = new LotterySet();
    c.playLottery();
  }

  public HashSet<Integer> createPlayerNumbers() {
    String numberStr = getPlayInput();
    HashSet<Integer> userNumbers = createPlayerNumbersFromString(numberStr);

    return userNumbers;
  }

  public String getPlayInput(){
    System.out.print("Enter six unique numbers sperated by spaces: ");
    Scanner scan = new Scanner(System.in);
    String numberStr = scan.nextLine();
    return numberStr;
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

    // while(lotteryNumbers.size() < count){
    //   Random rand = new Random();
    //   lotteryNumbers.add(rand.nextInt(50));
    // }
    lotteryNumbers.add(1);
    lotteryNumbers.add(2);
    lotteryNumbers.add(8);
    lotteryNumbers.add(9);
    lotteryNumbers.add(0);
    lotteryNumbers.add(6);

    System.out.print("Lottery numbers: ");
    System.out.println(lotteryNumbers);
    return lotteryNumbers;
  }

  public void compareWinnings(HashSet<Integer> player, HashSet<Integer> lottery) {
    System.out.print("Your Numbers: ");
    System.out.println(player);
    player.retainAll(lottery);
    System.out.println(player);
  }

  public void playLottery() {
    compareWinnings(createPlayerNumbers(), createLotteryNumbers(6));
  }

}
