package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        int index = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if(numberToSkip > lastInRow) {
                System.out.println("number to skip is bugger then the last");
                break;
            }
            else if(lastInRow < 0) {
                System.out.println("last number in row is negative");
                break;
            }
            else if(numberToSkip == sum)
                index = sum;
            sum += i;
        }
        if(sum > 0){
            System.out.println("skipped sum is " + index);
            System.out.println("counted sum is number " + (sum-index));
        }
    }
}
