public class FactorialSum {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int factorialSum = 0;
            for (int j = 1; j <= i; j++) {
                factorialSum += factorial(j);
            }
            sum += factorialSum;
        }
        System.out.println("1!+(1!+2!)+...+(1!+2!+...+n!) 的值为：" + sum);
    }
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
