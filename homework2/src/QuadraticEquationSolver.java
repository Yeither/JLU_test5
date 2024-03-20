import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一元二次方程的三个系数（a, b, c）：");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("方程的两个实根分别为：" + root1 + " 和 " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("方程有一个实根：" + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("方程有两个虚根：" + realPart + " + " + imaginaryPart + "i 和 " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
