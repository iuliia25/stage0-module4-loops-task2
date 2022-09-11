package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 1;
        while (count <= printToInclusive) {
            int i = 1;
            while (i < count) {
                if (count / i == 0) {
                }
                i ++;
            }
            System.out.println(count);
            count ++;
        }

    }
}
