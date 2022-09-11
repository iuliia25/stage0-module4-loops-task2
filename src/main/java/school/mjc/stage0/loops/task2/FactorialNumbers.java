package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int i = 1;
        int count = 0;
        while (count <= printToInclusive) {
            while (i <= count) {
                factorial = factorial * i;
                i ++;
            }
            System.out.println(factorial);
            count ++;
        }
    }
}
