import java.util.Scanner;

public class TrigonometryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入角度值：");
        double angle = scanner.nextDouble();
        scanner.close();
        double radian = Math.toRadians(angle);
        double sineValue = Math.sin(radian);
        double cosineValue = Math.cos(radian);
        // 输出结果
        System.out.println("角度 " + angle + " 的正弦值为：" + sineValue);
        System.out.println("角度 " + angle + " 的余弦值为：" + cosineValue);
    }
}
