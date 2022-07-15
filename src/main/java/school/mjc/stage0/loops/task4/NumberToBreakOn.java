package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int i = 1; i <= numberToGoUntil; i++) {
            if(numberToGoUntil < toBreakWith) {
                System.out.println("iterating till the end");
                for (int j=1; j<=numberToGoUntil; j++) {
                    System.out.println(j);
                }
                break;
            }
            else {
                System.out.println(i);
                if (i == toBreakWith)
                    break;
            }
        }
    }
}
