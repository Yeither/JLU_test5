public class GoldbachConjecture {
    public static void main(String[] args) {
        int evenNumber = 13478; // 要验证的偶数
        findPrimePair(evenNumber);
    }

    // 判断一个数是否是素数
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 找出两个素数之和等于给定的偶数
    public static void findPrimePair(int evenNumber) {
        if (evenNumber <= 2 || evenNumber % 2 != 0) {
            System.out.println("输入的数字不是大于2的偶数！");
            return;
        }
        for (int i = 2; i <= evenNumber / 2; i++) {
            if (isPrime(i) && isPrime(evenNumber - i)) {
                System.out.printf("偶数为 %d\n", evenNumber);
                System.out.printf("%d = %d + %d\n", evenNumber, i, evenNumber - i);
                return;
            }
        }
        System.out.println("找不到两个素数之和等于给定的偶数！");
    }
}
