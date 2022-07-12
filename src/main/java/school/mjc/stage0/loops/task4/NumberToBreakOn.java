package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int i = 0; i < numberToGoUntil; i++) {
            System.out.println(i);
            if(numberToGoUntil < toBreakWith) {
                System.out.println("iterating till the end");
                break;
            }
        }
    }
}
