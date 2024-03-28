public class Answer {
    public static boolean printPrimeNums(int number) {

        for (int i = 2; i <number ; i++) {
                boolean check = true;
                    for(int j = 2; j < i; j++ ) {
                        if (i % j == 0) {
                            check = false;
                            break;
                        }

                }
                    if (check) {
                        System.out.println(i);
                    }
        }

        return false;
    }
}
