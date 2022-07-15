package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        int[] arr = new int[numberToGoUntil];
        int count = 0 , j = 0;
        int[] array = new int[count];
        for (int i = 1; i <= numberToGoUntil; i++) {
            count++;
            arr[j++] = i;
            if(numberToGoUntil < toBreakWith) {
                System.out.print("iterating till the end");
                j = 0;
                for (int k = 0; k < array.length; k++) {
                    array[k] = arr[j++];
                }
                for (int k = 0; k < array.length; k++) {
                    System.out.println(array[i]);
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
