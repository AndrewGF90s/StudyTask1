public class Answer {
    public void printPrimeNums() {
        int number = 1000;
        for (int i = 1; i <number ; i++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println(i);
                }
        }

    }
}
