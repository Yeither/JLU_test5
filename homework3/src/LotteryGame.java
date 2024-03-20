import java.util.Scanner;
import java.util.Random;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个1~20的数字作为你的选择：");
        int userNumber = scanner.nextInt();
        scanner.close();

        // 生成1~20不相同的三个随机数字，分别代表一等奖、二等奖和三等奖的获奖数字
        Random random = new Random();
        int firstPrize = random.nextInt(20) + 1;
        int secondPrize = firstPrize;
        int thirdPrize = firstPrize;
        while (secondPrize == firstPrize) {
            secondPrize = random.nextInt(20) + 1;
        }
        while (thirdPrize == firstPrize || thirdPrize == secondPrize) {
            thirdPrize = random.nextInt(20) + 1;
        }

        System.out.println("一等奖的获奖数字为：" + firstPrize);
        System.out.println("二等奖的获奖数字为：" + secondPrize);
        System.out.println("三等奖的获奖数字为：" + thirdPrize);
        if (userNumber == firstPrize) {
            System.out.println("恭喜您中了一等奖！");
        } else if (userNumber == secondPrize) {
            System.out.println("恭喜您中了二等奖！");
        } else if (userNumber == thirdPrize) {
            System.out.println("恭喜您中了三等奖！");
        } else {
            System.out.println("很遗憾，您没有中奖。");
        }
    }
}

