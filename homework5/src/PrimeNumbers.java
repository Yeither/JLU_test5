public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("100以内的素数有：");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // 如果能整除，则不是素数，跳出内循环
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
