public class Answer {
    public static void printPrimeNums(int number) {
        for (int i = 2; i < number; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) { // Оптимизированный цикл
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }

}