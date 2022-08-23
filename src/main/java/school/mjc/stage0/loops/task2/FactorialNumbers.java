package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        if(printToInclusive>0){
            int i = 1, j = 1;
             System.out.println(i);
             while(i<printToInclusive) {
                 System.out.println(j);
                 i++;
                 j *= i;
             }
        }

    }
}
