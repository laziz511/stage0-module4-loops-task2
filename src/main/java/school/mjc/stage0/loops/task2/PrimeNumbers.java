package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive >= 2)
            System.out.println("2");
        else return;
        int sqr;

        outer:
        for(int i = 3; i <= printToInclusive; i+=2) {
            sqr = (int) Math.sqrt(i) + 1;
            for (int k = 3; k <= sqr; k += 2) {
                if (i % k == 0)
                    continue outer;
            }
            System.out.println(i);
        }
        
    }
}
