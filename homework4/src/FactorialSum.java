import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数 n 计算1! + 2! + 3! + ... +n!： ");
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        System.out.println("结果为： " + sum);
    }
}
